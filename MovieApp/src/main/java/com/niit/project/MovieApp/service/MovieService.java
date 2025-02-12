package com.niit.project.MovieApp.service;

import com.niit.project.MovieApp.model.Movies;

import java.util.List;

public interface MovieService {

    public Movies addMovies(Movies movies);
    public abstract List<Movies> getAllMovies();
}
