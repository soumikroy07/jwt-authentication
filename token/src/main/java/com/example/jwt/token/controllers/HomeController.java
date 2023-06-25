package com.example.jwt.token.controllers;

import com.example.jwt.token.models.User;
import com.example.jwt.token.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping(path = "/home")
public class HomeController {

    @Autowired
    private UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/user")
    public List<User> getUser(){
        System.out.println("my user");
        return this.userService.getList();
    }

    @GetMapping(path = "/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
