package com.niit.project.RecommendedMovieService.repository;


import com.niit.project.RecommendedMovieService.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,Integer> {
}
