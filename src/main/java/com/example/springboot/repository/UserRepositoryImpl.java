package com.example.springboot.repository;

import com.example.springboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private List<User> userDatabase = new ArrayList<>();

    @Override
    public User createUser(User user) {
        User createdUser = new User(user.getUserName(), user.getGender());
        userDatabase.add(createdUser);
        return createdUser;
    }

    @Override
    public Optional<User> findById(UUID uuid) {
        return userDatabase
                .stream()
                .filter(
                        user -> user.getUuid().equals(uuid)
                ).findFirst();
    }
}
