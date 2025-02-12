package com.niit.project.MovieApp.service;

import com.niit.project.MovieApp.model.Movies;
import com.niit.project.MovieApp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

     private MovieRepository movieRepository;

     @Autowired
    public MovieServiceImpl(MovieRepository movieRepository)
    {
        this.movieRepository=movieRepository;
    }

    @Override
    public Movies addMovies(Movies movies) {
        return movieRepository.save(movies);
    }

    @Override
    public List<Movies> getAllMovies() {
        return movieRepository.findAll();
    }
}
