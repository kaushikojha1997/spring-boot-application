package com.example.springboot.service;

import com.example.springboot.model.User;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface UserService {
    User createUser(User user);
    User findById(UUID uuid);
}
