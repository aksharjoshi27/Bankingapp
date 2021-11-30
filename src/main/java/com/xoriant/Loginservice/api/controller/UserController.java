package com.xoriant.Loginservice.api.controller;

import com.xoriant.Loginservice.api.entity.Users;
import com.xoriant.Loginservice.api.mapper.UserMapper;
import com.xoriant.Loginservice.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author rohit
 * @Date 30/11/21
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Users users) {
        return new ResponseEntity(userService.create(users), HttpStatus.OK);
    }

    @PostMapping("auth")
    public ResponseEntity<?> auth(@RequestBody UserMapper users) {
        return new ResponseEntity(userService.auth(users), HttpStatus.OK);
    }
}
