package com.appsdeveloperblog.app.ws.mobileappws.userService;

import com.appsdeveloperblog.app.ws.mobileappws.ui.model.request.UserDetailRequestModel;
import com.appsdeveloperblog.app.ws.mobileappws.ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailRequestModel userDetails);
}
