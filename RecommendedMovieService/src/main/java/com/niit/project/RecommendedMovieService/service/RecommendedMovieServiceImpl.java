package com.niit.project.RecommendedMovieService.service;

import com.niit.project.RecommendedMovieService.model.RecommendedMovies;
import com.niit.project.RecommendedMovieService.repository.RecommendedMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendedMovieServiceImpl implements RecommendedMovieService{

    private RecommendedMoviesRepository recommendedMoviesRepository;

    @Autowired
    public RecommendedMovieServiceImpl(RecommendedMoviesRepository recommendedMoviesRepository){
        this.recommendedMoviesRepository=recommendedMoviesRepository;
    }


    @Override
    public RecommendedMovies addRecommendedMovie(RecommendedMovies recommendedMovies) {
        return recommendedMoviesRepository.save(recommendedMovies);
    }

    @Override
    public List<RecommendedMovies> getAllRecommendedMovies() {
        return recommendedMoviesRepository.findAll();
    }
}
