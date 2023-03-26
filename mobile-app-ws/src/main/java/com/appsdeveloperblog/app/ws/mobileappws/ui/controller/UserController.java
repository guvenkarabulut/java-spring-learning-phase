package com.appsdeveloperblog.app.ws.mobileappws.ui.controller;

import com.appsdeveloperblog.app.ws.mobileappws.exceptions.UserServiceException;
import com.appsdeveloperblog.app.ws.mobileappws.ui.model.request.UpdateUserDetailRequestModel;
import com.appsdeveloperblog.app.ws.mobileappws.ui.model.request.UserDetailRequestModel;
import com.appsdeveloperblog.app.ws.mobileappws.ui.model.response.UserRest;
import com.appsdeveloperblog.app.ws.mobileappws.userService.UserService;
import com.appsdeveloperblog.app.ws.mobileappws.userService.impl.UserServiceImpl;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping(path="users")// ! http://localhost:8080/users
public class UserController {
    Map<String,UserRest> users;
    @Autowired
    UserService userService;

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
        if (true) throw new UserServiceException("A User Service Exception is throw");
        if (users.containsKey(userId)){
            return new ResponseEntity<UserRest>(users.get(userId),HttpStatus.OK);
        }else {
            return new ResponseEntity<UserRest>(HttpStatus.NO_CONTENT);
        }
    }
    // ! http://localhost:8080/users
    @PostMapping(consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
            ,produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserRest> createUser(@Valid @RequestBody  UserDetailRequestModel userDetails) {
        UserRest returnValue = new UserServiceImpl().createUser(userDetails);

        return new ResponseEntity<UserRest>(returnValue, HttpStatusCode.valueOf(250));
    }
    // ! http://localhost:8080/users
    @PutMapping(path="/{userId}",
            consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
            ,produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public UserRest updateUser(@PathVariable String userId,@Valid @RequestBody UpdateUserDetailRequestModel userDetails){

       UserRest storedUserDetails= users.get(userId);
       storedUserDetails.setFirstName(userDetails.getFirstName());
       storedUserDetails.setLastName(userDetails.getLastName());

       users.put(userId,storedUserDetails);

       return storedUserDetails;
    }
    // ! http://localhost:8080/user
    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id){

        users.remove(id);
        return  ResponseEntity.noContent().build();
    }
}
