package com.niit.project.FavouriteMovieService.repository;

import com.niit.project.FavouriteMovieService.model.FavouriteMovies;
import com.niit.project.FavouriteMovieService.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,Integer> {


}
