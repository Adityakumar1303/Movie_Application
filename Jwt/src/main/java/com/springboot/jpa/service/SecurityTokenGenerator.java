package com.springboot.jpa.service;

import com.springboot.jpa.model.User;
import org.springframework.stereotype.Service;

import java.util.Map;


public interface SecurityTokenGenerator {

    public abstract Map<String, String> generateToken(User user);

}
