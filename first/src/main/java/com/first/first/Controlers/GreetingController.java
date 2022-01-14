package com.first.first.Controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class GreetingController {

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("title", "login");
		return "login";
	}
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Main Page");
		return "home";
	}
	
	
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About us");
		return "about";
	}

}
