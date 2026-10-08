package com.jwtex.example.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/home")
    public String userHome(
            Authentication authentication) {

        return "Welcome "
                + authentication.getName()
                + ", you are authenticated!";
    }

    @GetMapping("/profile")
    public String profile(
            Authentication authentication) {

        return "User Profile: "
                + authentication.getName();
    }
}