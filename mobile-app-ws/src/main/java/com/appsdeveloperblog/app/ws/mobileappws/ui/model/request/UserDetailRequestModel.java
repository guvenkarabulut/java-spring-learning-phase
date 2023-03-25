package com.appsdeveloperblog.app.ws.mobileappws.ui.model.request;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDetailRequestModel {
    @NotNull(message = "First name cannot be null")
    @Size(min = 2,message = "Firstname must be equal or greater than 2 characters ")
    private String firstName;
    @NotNull(message = "Last name cannot be null")
    @Size(min = 2,message = "Lastname must be equal or greater than 2 characters ")
    private String lastName;
    @NotNull(message = "email cannot be null")
    @Email
    private String email;
    @NotNull(message = "Password cannot be null")
     @Size(min = 8,max=16,message = "Password must be equal or greater than 8 characters and less than 16 character")
    private String password;



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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
