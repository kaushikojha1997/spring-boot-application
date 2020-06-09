package com.example.springboot.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class UserResponseDto<T> {

    private HttpStatus httpStatus;
    private T data;

    public UserResponseDto(HttpStatus httpStatus, T data) {
        this.httpStatus = httpStatus;
        this.data = data;
    }

}