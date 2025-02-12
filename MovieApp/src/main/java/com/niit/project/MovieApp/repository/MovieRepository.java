package com.niit.project.MovieApp.repository;

import com.niit.project.MovieApp.model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movies,String> {
}
