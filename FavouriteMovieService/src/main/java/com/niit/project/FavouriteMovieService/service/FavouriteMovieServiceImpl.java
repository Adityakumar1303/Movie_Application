package com.niit.project.FavouriteMovieService.service;

import com.niit.project.FavouriteMovieService.model.FavouriteMovies;
import com.niit.project.FavouriteMovieService.repository.FavouriteMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteMovieServiceImpl implements FavouriteMovieService{

    private FavouriteMoviesRepository favouriteMoviesRepository;

    @Autowired
    public FavouriteMovieServiceImpl(FavouriteMoviesRepository favouriteMoviesRepository){
        this.favouriteMoviesRepository=favouriteMoviesRepository;
    }


    @Override
    public FavouriteMovies addFavouriteMovie(FavouriteMovies favouriteMovies) {
        return favouriteMoviesRepository.save(favouriteMovies);
    }

    @Override
    public List<FavouriteMovies> getAllFavouriteMovies() {
        return favouriteMoviesRepository.findAll();
    }
}
