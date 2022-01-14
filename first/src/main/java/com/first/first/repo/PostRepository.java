package com.first.first.repo;

import org.springframework.data.repository.CrudRepository;

import com.first.first.model.*;

public interface PostRepository extends CrudRepository<Post, Long> {

}
