package com.niit.project.RecommendedMovieService.repository;

import com.niit.project.RecommendedMovieService.model.RecommendedMovies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendedMoviesRepository extends MongoRepository<RecommendedMovies,Integer> {


}
