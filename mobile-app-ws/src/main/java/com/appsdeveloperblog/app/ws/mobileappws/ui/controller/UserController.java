package com.appsdeveloperblog.app.ws.mobileappws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="users")// ! http://localhost:8080/users
public class UserController {
    @GetMapping// ! http://localhost:8080/users?page=<pageNo>&limit=<limitNo>
    public String getUsers(@RequestParam(value = "page") int page,@RequestParam(value = "limit") int limit){
        return "get users was called with page: "+page+" limit: "+limit;
    }
    @GetMapping(path="/{userId}")// ! http://localhost:8080/users/{userId}
    public String getUser(@PathVariable String userId){
        return "get user was called"+userId;
    }
    @PostMapping// ! http://localhost:8080/users
    public String createUser(){
        return "createUser was called";
    }
    @PutMapping// ! http://localhost:8080/users
    public String updateUser(){
        return "updateUser was called";
    }
    @DeleteMapping// ! http://localhost:8080/users
    public String deleteUser(){
        return  "deleteUser wass called";
    }
}
