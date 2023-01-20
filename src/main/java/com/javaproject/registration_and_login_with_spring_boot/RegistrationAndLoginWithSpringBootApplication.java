package com.javaproject.registration_and_login_with_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class RegistrationAndLoginWithSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationAndLoginWithSpringBootApplication.class, args);
    }

}
