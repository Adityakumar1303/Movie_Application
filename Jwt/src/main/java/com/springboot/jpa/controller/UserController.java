package com.springboot.jpa.controller;

import com.springboot.jpa.exceptions.UserNotFoundException;
import com.springboot.jpa.model.User;
import com.springboot.jpa.service.SecurityTokenGenerator;
import com.springboot.jpa.service.SecurityTokenGeneratorImpl;
import com.springboot.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@CrossOrigin("*")
@RestController
@RequestMapping("/user/auth")
public class UserController {

    private UserService userService;
    private SecurityTokenGenerator securityTokenGenerator;

    @Autowired
    public UserController(UserService userService, SecurityTokenGenerator securityTokenGenerator)
    {
        this.userService=userService;
        this.securityTokenGenerator=securityTokenGenerator;
    }
    //http://localhost:7777/user/auth/register

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user)
    {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK);
    }

    @GetMapping("/getallusers")
    public ResponseEntity<?> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginCheck(@RequestBody User user) throws UserNotFoundException{
        Map<String, String> map=null;
        try{
            User res=userService.authenticateUser(user.getUsername(),user.getPassword());
            if(Objects.equals(res.getUsername(), user.getUsername())) {
                map=securityTokenGenerator.generateToken(res);
            }
                return new ResponseEntity<>(map, HttpStatus.OK);

        }
        catch (UserNotFoundException ex)
        {
            throw new UserNotFoundException();
        }
        catch (Exception ex)
        {
            return new ResponseEntity<>("Other Exception",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
