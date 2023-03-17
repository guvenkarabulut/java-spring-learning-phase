package com.learning.lesson1.controller;

import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping(path="/api")
public class HelloController {
    @GetMapping(path="/hello")
    //@RequestMapping(path="/hello",method = RequestMethod.GET)
    public String sayHelloGet(){
        return "Get Anotasyonu";
    }
    @PostMapping(path="/hello")
    public String sayHelloPost(){
        return "Post Anotasyonu";
    }
    @PutMapping(path="/hello")
    public String sayHelloPut(){
        return "Put Anotasyonuy";
    }
}
