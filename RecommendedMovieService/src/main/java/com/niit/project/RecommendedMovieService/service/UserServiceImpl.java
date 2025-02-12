package com.niit.project.RecommendedMovieService.service;


import com.niit.project.RecommendedMovieService.model.User;
import com.niit.project.RecommendedMovieService.repository.UserRepository;
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
