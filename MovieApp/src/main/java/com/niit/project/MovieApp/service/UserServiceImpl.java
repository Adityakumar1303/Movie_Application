package com.niit.project.MovieApp.service;

import com.niit.project.MovieApp.model.User;
import com.niit.project.MovieApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
