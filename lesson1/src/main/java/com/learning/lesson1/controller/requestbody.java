package com.learning.lesson1.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.learning.lesson1.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping(path="/api")
public class requestbody {
    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        System.out.println("user Saved");
        String pass = user.getPassword();
        user.setPassword(Base64.getEncoder().encodeToString(pass.getBytes()));
        return user;
    }
    @PostMapping("/users-all")
    public List<User> saveAllUsers(@RequestBody List<User> users){
        System.out.println("user Saved");
        users.forEach(user->user.setPassword(Base64.getEncoder().encodeToString(user.getPassword().getBytes())));
        return users;
    }
}
