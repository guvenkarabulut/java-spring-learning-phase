package com.appsdeveloperblog.app.ws.mobileappws.ui.controller;

import com.appsdeveloperblog.app.ws.mobileappws.ui.model.response.UserRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="users")// ! http://localhost:8080/users
public class UserController {
    @GetMapping// ! http://localhost:8080/users?page=<pageNo>&limit=<limitNo>&sort<sort>
    // ! here sort a optinial parameter if you dont type ws return null for sort parameter
    // ! req:http://localhost:8080/users?page=1&limit=50
    // ! res:get users was called with page: 1 limit: 50sort: null
    public String getUsers(
            @RequestParam(value = "page",defaultValue = "1") int page
            ,@RequestParam(value = "limit") int limit
            ,@RequestParam(value = "sort",required = false) String sort){
        return "get users was called with page: "+page+" limit: "+limit +" sort: "+sort;
    }
    @GetMapping(path="/{userId}")// ! http://localhost:8080/users/{userId}
    public UserRest getUser(@PathVariable String userId){
        UserRest returnValue = new UserRest();
        returnValue.setEmail("sea@gmail.com");
        returnValue.setFirstName("sea");
        returnValue.setLastName("ase");

        return returnValue;
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
