package com.org.multipledatabases.controller;

import com.org.multipledatabases.mysql.entity.User;
import com.org.multipledatabases.mysql.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;


    @GetMapping("")
    public ResponseEntity<List<User>> getAllUser() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }
}
