package com.niit.project.FavouriteMovieService.controller;



import com.niit.project.FavouriteMovieService.model.User;
import com.niit.project.FavouriteMovieService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService=userService;
    }

    @PostMapping("/user-info")
    public ResponseEntity<?> addUser(@RequestBody User user)
    {
        return  new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }

}
