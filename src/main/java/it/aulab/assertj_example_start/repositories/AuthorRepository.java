package it.aulab.assertj_example_start.repositories;

import org.springframework.data.repository.CrudRepository;

import it.aulab.assertj_example_start.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
   
}