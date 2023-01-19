package com.javaproject.registration_and_login_with_spring_boot.service;
import com.javaproject.registration_and_login_with_spring_boot.model.Role;
import com.javaproject.registration_and_login_with_spring_boot.model.User;
import com.javaproject.registration_and_login_with_spring_boot.respository.UserRepository;
import com.javaproject.registration_and_login_with_spring_boot.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(
                registrationDto.getFirstName(),
                registrationDto.getLastName(),
                registrationDto.getEmail(),
                registrationDto.getPassword(),
                Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);
    }

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        super();
        this.userRepository = userRepository;
    }
}
