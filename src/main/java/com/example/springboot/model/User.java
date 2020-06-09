package com.example.springboot.model;

import com.example.springboot.utils.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    private UUID uuid;
    private String userName;
    public Constants.Gender gender;

    public User(String userName,Constants.Gender gender){
        uuid = UUID.randomUUID();
        this.userName = userName;
        this.gender = gender;
    }
}
