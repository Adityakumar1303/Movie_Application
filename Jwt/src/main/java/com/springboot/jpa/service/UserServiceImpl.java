package com.springboot.jpa.service;

import com.springboot.jpa.exceptions.UserNotFoundException;
import com.springboot.jpa.model.User;
import com.springboot.jpa.proxy.FavouritesProxy;
import com.springboot.jpa.proxy.MoviesProxy;
import com.springboot.jpa.proxy.RecommendedProxy;
import com.springboot.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private MoviesProxy moviesProxy;
    private RecommendedProxy recommendedProxy;
    private FavouritesProxy favouritesProxy;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, MoviesProxy moviesProxy, RecommendedProxy recommendedProxy, FavouritesProxy favouritesProxy)
    {
        this.userRepository=userRepository;
        this.moviesProxy=moviesProxy;
        this.favouritesProxy=favouritesProxy;
        this.recommendedProxy=recommendedProxy;
    }

    @Override
    public User saveUser(User user) {
        User result= userRepository.save(user);

        ResponseEntity r1=moviesProxy.createUser(result);
        ResponseEntity r2=recommendedProxy.createUser(result);
        ResponseEntity r3=favouritesProxy.createUser(result);

        return result;
    }

    @Override
    public User authenticateUser(String username, String password) throws UserNotFoundException{
        User user=userRepository.findByUsernameAndPassword(username,password);
        if(user!=null)
        {
            return user;
        }
        else
        {
            throw new UserNotFoundException();
        }
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
