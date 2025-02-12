package com.niit.project.RecommendedMovieService.controller;

import com.niit.project.RecommendedMovieService.model.RecommendedMovies;
import com.niit.project.RecommendedMovieService.service.RecommendedMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/recommended")
public class RecommendedMovieController {

    private RecommendedMovieService recommendedMovieService;

    @Autowired
    public RecommendedMovieController(RecommendedMovieService recommendedMovieService)
    {
        this.recommendedMovieService=recommendedMovieService;
    }
    @PostMapping("/recommended-movies")
    public ResponseEntity<?> addRecommendedMovie(@RequestBody RecommendedMovies recommendedMovies){
        return new ResponseEntity<>(recommendedMovieService.addRecommendedMovie(recommendedMovies), HttpStatus.OK);
    }

    @GetMapping("/recommended-movies")
    public ResponseEntity<?> getAllRecommendedMovies()
    {
        return new ResponseEntity<>(recommendedMovieService.getAllRecommendedMovies(),HttpStatus.OK);
    }
}
