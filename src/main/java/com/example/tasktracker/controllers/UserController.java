package com.example.tasktracker.controllers;

import com.example.tasktracker.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {
    @GetMapping
    public User getUser(@RequestParam(value = "name") String name, @RequestParam(value = "password") String password, @RequestParam(value = "email") String email) {
        var uuid = UUID.randomUUID().toString();
//        Hash password
        return new User(uuid, name, password, email);
    }
}