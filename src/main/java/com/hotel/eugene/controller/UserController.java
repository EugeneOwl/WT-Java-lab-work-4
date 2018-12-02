package com.hotel.eugene.controller;

import com.hotel.eugene.entity.User;
import com.hotel.eugene.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "users", produces = APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("{id}")
    public User findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return service.create(user);
    }
}
