package com.niit.project.FavouriteMovieService.service;



import com.niit.project.FavouriteMovieService.model.FavouriteMovies;
import com.niit.project.FavouriteMovieService.model.User;
import com.niit.project.FavouriteMovieService.repository.UserRepository;
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

    @Override
    public User updateUser(User user,String mn) {
        //return null;
        // get user record  from data base based on paramerer user.userid
        // updated db record with recieved details
        //
        return user;
    }


}
