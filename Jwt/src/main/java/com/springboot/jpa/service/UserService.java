package com.springboot.jpa.service;

import com.springboot.jpa.exceptions.UserNotFoundException;
import com.springboot.jpa.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {


    public abstract User saveUser(User user);
    public abstract User authenticateUser(String username,String password) throws UserNotFoundException;
    public abstract List<User> getAllUsers();

}
