package com.appsdeveloperblog.app.ws.mobileappws.userService;

import com.appsdeveloperblog.app.ws.mobileappws.ui.model.request.UpdateUserDetailRequestModel;
import com.appsdeveloperblog.app.ws.mobileappws.ui.model.request.UserDetailRequestModel;
import com.appsdeveloperblog.app.ws.mobileappws.ui.model.response.UserRest;

import java.util.Map;

public interface UserService {
    UserRest createUser(UserDetailRequestModel userDetails);
    UserRest getUser(String id);
    Map<String,UserRest> getUsers();
}
