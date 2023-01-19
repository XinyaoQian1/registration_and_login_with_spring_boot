package com.javaproject.registration_and_login_with_spring_boot.service;

import com.javaproject.registration_and_login_with_spring_boot.model.User;
import com.javaproject.registration_and_login_with_spring_boot.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);

}
