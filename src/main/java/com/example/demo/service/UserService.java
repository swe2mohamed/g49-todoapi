package com.example.demo.service;

import com.example.demo.domain.dto.UserDTOForm;
import com.example.demo.domain.dto.UserDTOView;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserService {
    /*
    - Register user.
    - Change password
    - Find user by email
    - Disable user by email
    - enable user by email
    - ...
     */
    UserDTOView register(UserDTOForm dtoForm);

    Optional<UserDTOView> getByEmail(String email);
    void disableByEmail(String email);
    void enableByEmail(String email);
}
