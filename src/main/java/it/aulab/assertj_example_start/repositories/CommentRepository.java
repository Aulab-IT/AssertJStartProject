package it.aulab.assertj_example_start.repositories;

import org.springframework.data.repository.CrudRepository;

import it.aulab.assertj_example_start.models.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{
   
}