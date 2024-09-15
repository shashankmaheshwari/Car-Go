package com.programming.CarGo.services.impl;

import com.programming.CarGo.dto.DriverDto;
import com.programming.CarGo.dto.SignupDto;
import com.programming.CarGo.dto.UserDto;
import com.programming.CarGo.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
