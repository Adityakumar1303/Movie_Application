package com.springboot.jpa.proxy;


import com.springboot.jpa.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="favourite-movies-service",url="localhost:5555" )

public interface FavouritesProxy {
    @PostMapping("/user/user-info")
    public ResponseEntity<?> createUser(@RequestBody User user);
}
