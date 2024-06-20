package com.example.demo.service;

import com.example.demo.domain.dto.UserDTOForm;
import com.example.demo.domain.dto.UserDTOView;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    //todo: add required dependencies

    @Override
    public UserDTOView register(UserDTOForm dtoForm) {
        //todo: Implement method
        return null;
    }

    @Override
    public Optional<UserDTOView> getByEmail(String email) {
        //todo: Implement method
        return Optional.empty();
    }

    @Override
    public void disableByEmail(String email) {
        //todo: Implement method
    }

    @Override
    public void enableByEmail(String email) {
        //todo: Implement method
    }
}
