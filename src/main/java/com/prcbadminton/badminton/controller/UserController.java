package com.prcbadminton.badminton.controller;

import com.prcbadminton.badminton.entities.User;
import com.prcbadminton.badminton.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
