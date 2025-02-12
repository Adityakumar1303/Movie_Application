package com.niit.project.FavouriteMovieService.controller;

import com.niit.project.FavouriteMovieService.model.FavouriteMovies;
import com.niit.project.FavouriteMovieService.service.FavouriteMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/favourites")
public class FavouriteMoviesController {


    private FavouriteMovieService favouriteMovieService;

    @Autowired
    public FavouriteMoviesController(FavouriteMovieService favouriteMovieService)
    {
        this.favouriteMovieService=favouriteMovieService;
    }

    @PostMapping("/favourite-movies")
    public ResponseEntity<?> addFavouriteMovie(@RequestBody FavouriteMovies favouriteMovies){
        return  new ResponseEntity<>(favouriteMovieService.addFavouriteMovie(favouriteMovies), HttpStatus.OK);
    }

    @GetMapping("/favourite-movies")
    public ResponseEntity<?> getAllFavouriteMovies()
    {
        return  new ResponseEntity<>(favouriteMovieService.getAllFavouriteMovies(),HttpStatus.OK);
    }

}
