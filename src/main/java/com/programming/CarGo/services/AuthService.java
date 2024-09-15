package com.programming.CarGo.services;

import com.programming.CarGo.dto.DriverDto;
import com.programming.CarGo.dto.SignupDto;
import com.programming.CarGo.dto.UserDto;

public interface AuthService {

    String login(String email,String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);
}
