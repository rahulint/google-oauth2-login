package com.social.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SpringSsoGoogleApplication {

    @GetMapping
    public String welcome() {
        return "Welcome to Google !!";
    }

    @GetMapping("/healthcheck")
    public String healthCheck() {
        return "Application is running healthy !!";
    }

    @GetMapping("/user")
    public Principal user(Principal principal) {
        System.out.println("username : " + principal.getName());
        return principal;
    }
}
