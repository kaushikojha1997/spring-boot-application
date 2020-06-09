package com.example.springboot.controller;

import com.example.springboot.dto.UserResponseDto;
import com.example.springboot.model.User;
import com.example.springboot.service.UserService;
import com.example.springboot.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(Constants.USERS_END_POINT)
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{uuid}")
    public UserResponseDto<User> getUser(@PathVariable(name = "uuid") UUID uuid) {
        User serviceResponse = userService.findById(uuid);
        if(serviceResponse == null) {
            return new UserResponseDto<>(HttpStatus.NOT_FOUND, serviceResponse);
        }
        return new UserResponseDto<>(HttpStatus.FOUND, serviceResponse);
    }
}