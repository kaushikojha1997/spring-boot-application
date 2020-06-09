package com.example.springboot.repository;

import com.example.springboot.model.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {

    User createUser(User user);
    Optional<User> findById(UUID uuid);

}

