package com.niit.project.MovieApp.controller;

import com.niit.project.MovieApp.model.Movies;
import com.niit.project.MovieApp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService)
    {
        this.movieService=movieService;
    }


    @PostMapping("/movie-details")
    public ResponseEntity<?> addMovies(@RequestBody Movies movies)
    {
        return new ResponseEntity<>(movieService.addMovies(movies), HttpStatus.OK);
    }

    @GetMapping("/all-movies")
    public ResponseEntity<?> getAllMovies()
    {
        return new ResponseEntity<>(movieService.getAllMovies(),HttpStatus.OK);
    }

}
