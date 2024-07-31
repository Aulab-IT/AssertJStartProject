package it.aulab.assertj_example_start.repositories;

import org.springframework.data.repository.CrudRepository;

import it.aulab.assertj_example_start.models.Post;

public interface PostRepository extends CrudRepository<Post, Long>{
   
}