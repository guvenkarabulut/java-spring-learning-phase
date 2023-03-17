package com.learning.lesson1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class requestheader {
    @GetMapping("/header")
    public String getHeader(@RequestHeader("MyHeader") String myHeader){
        return "Your Header is " + myHeader;
    }
}
