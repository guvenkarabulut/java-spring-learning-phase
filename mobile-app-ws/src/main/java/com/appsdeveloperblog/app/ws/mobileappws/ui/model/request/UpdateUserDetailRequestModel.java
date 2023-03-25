package com.appsdeveloperblog.app.ws.mobileappws.ui.model.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UpdateUserDetailRequestModel {
    @NotNull(message = "First name cannot be null")
    @Size(min = 2,message = "Firstname must be equal or greater than 2 characters ")
    private String firstName;
    @NotNull(message = "Last name cannot be null")
    @Size(min = 2,message = "Lastname must be equal or greater than 2 characters ")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
