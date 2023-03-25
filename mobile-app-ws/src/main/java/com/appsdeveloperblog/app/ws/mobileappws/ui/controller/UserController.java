package com.appsdeveloperblog.app.ws.mobileappws.ui.controller;

import com.appsdeveloperblog.app.ws.mobileappws.ui.model.request.UserDetailRequestModel;
import com.appsdeveloperblog.app.ws.mobileappws.ui.model.response.UserRest;
import jakarta.validation.Valid;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="users")// ! http://localhost:8080/users
public class UserController {
    @GetMapping// ! http://localhost:8080/users?page=<pageNo>&limit=<limitNo>&sort<sort>
    // ! here sort a optional parameter if you don't type ws return null for sort parameter
    // ! req:http://localhost:8080/users?page=1&limit=50
    // ! res:get users was called with page: 1 limit: 50 sort: null
    public String getUsers(
            @RequestParam(value = "page",defaultValue = "1") int page
            ,@RequestParam(value = "limit") int limit
            ,@RequestParam(value = "sort",required = false) String sort){
        return "get users was called with page: "+page+" limit: "+limit +" sort: "+sort;
    }
    // ! http://localhost:8080/users/{userId}
    @GetMapping(path="/{userId}",produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserRest> getUser(@PathVariable String userId){
        UserRest returnValue = new UserRest();
        returnValue.setEmail("sea@gmail.com");
        returnValue.setFirstName("sea");
        returnValue.setLastName("ase");
        returnValue.setUserId(userId);

        return new ResponseEntity<UserRest>(returnValue,HttpStatus.BAD_REQUEST);
    }
    // ! http://localhost:8080/users
    @PostMapping(consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
            ,produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserRest> createUser(@Valid @RequestBody  UserDetailRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        returnValue.setEmail(userDetails.getEmail());
        returnValue.setFirstName(userDetails.getFirstName());
        returnValue.setLastName(userDetails.getLastName());
        returnValue.setUserId(userDetails.getPassword());

        return new ResponseEntity<UserRest>(returnValue, HttpStatusCode.valueOf(250));
    }
    // ! http://localhost:8080/users
    @PutMapping
    public String updateUser(){
        return "updateUser was called";
    }
    // ! http://localhost:8080/user
    @DeleteMapping
    public String deleteUser(){
        return  "deleteUser was called";
    }
}
