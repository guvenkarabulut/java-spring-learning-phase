package com.appsdeveloperblog.app.ws.mobileappws.userService.impl;

import com.appsdeveloperblog.app.ws.mobileappws.shared.Utils;
import com.appsdeveloperblog.app.ws.mobileappws.ui.model.request.UserDetailRequestModel;
import com.appsdeveloperblog.app.ws.mobileappws.ui.model.response.UserRest;
import com.appsdeveloperblog.app.ws.mobileappws.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    Map<String,UserRest> users;
    Utils utils= new Utils();
    public UserServiceImpl(){}
    @Autowired
    public UserServiceImpl(Utils utils){
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        returnValue.setEmail(userDetails.getEmail());
        returnValue.setFirstName(userDetails.getFirstName());
        returnValue.setLastName(userDetails.getLastName());

        String userID = utils.generateUserId();
        returnValue.setUserId(userID);

        if(users==null) users=new HashMap<>();
        users.put(userID,returnValue);

        return returnValue;
    }
}
