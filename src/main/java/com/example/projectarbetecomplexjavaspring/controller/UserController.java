package com.example.projectarbetecomplexjavaspring.controller;

import com.example.projectarbetecomplexjavaspring.entity.UserEntity;
import com.example.projectarbetecomplexjavaspring.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("signup")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user) {
        UserEntity createdUser = userService.createUser(user);

        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<Iterable<UserEntity>> findAllUsers() {
        Iterable<UserEntity> allUsers = userService.findAllUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

}
