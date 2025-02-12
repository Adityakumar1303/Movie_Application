package com.niit.project.FavouriteMovieService.repository;

import com.niit.project.FavouriteMovieService.model.FavouriteMovies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteMoviesRepository extends MongoRepository<FavouriteMovies,Integer> {
}
