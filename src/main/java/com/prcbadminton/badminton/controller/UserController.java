package com.prcbadminton.badminton.controller;

import com.prcbadminton.badminton.entities.User;
import com.prcbadminton.badminton.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping(value = "/sign-up")
    public ResponseEntity signUp(@RequestBody User user) {
        boolean result = userService.signUp(user);
        if (result) {
            return new ResponseEntity(HttpStatus.OK);
        } else return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping(value = "/get-user")
    public ResponseEntity<User> getUser() {
        Principal principal = SecurityContextHolder.getContext().getAuthentication();
        String username = ((Authentication) principal).getPrincipal().toString();
        if (username.equals("anonymousUser")) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        Optional<User> account = (Optional<User>)((Authentication) principal).getCredentials();
        return new ResponseEntity(account, HttpStatus.OK);
    }
}
