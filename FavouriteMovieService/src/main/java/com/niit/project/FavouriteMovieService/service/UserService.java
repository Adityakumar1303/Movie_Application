package com.niit.project.FavouriteMovieService.service;


import com.niit.project.FavouriteMovieService.model.FavouriteMovies;
import com.niit.project.FavouriteMovieService.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {



    public abstract User addUser(User user);
    public abstract User updateUser(User user, String nm);



}
