package com.javaproject.registration_and_login_with_spring_boot.web;


import com.javaproject.registration_and_login_with_spring_boot.service.UserService;
import com.javaproject.registration_and_login_with_spring_boot.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;


    public UserRegistrationController(UserService userService){
        super();
        this.userService = userService;
    }


    // handler ()里面没看懂
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto){
        userService.save(registrationDto);
        return "redirect:/registration?success";

    }

    // shortcut for @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String showRegistrationForm() {

        return "registration";
    }


}
