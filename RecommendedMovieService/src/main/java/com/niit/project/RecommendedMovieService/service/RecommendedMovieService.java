package com.niit.project.RecommendedMovieService.service;

import com.niit.project.RecommendedMovieService.model.RecommendedMovies;

import java.util.List;

public interface RecommendedMovieService {

    public RecommendedMovies addRecommendedMovie(RecommendedMovies recommendedMovies);
    public abstract List<RecommendedMovies> getAllRecommendedMovies();
}
