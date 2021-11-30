package com.xoriant.Loginservice.api.service;

import com.xoriant.Loginservice.api.entity.Users;
import com.xoriant.Loginservice.api.mapper.UserMapper;
import com.xoriant.Loginservice.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author rohit
 * @Date 30/11/21
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users create(Users users) {
        Map<String, String> map = new HashMap<>();

        if (userRepository.findByUsername(users.getUsername()).isPresent()) {
            map.put("message", "user already present!");
            users.setMap(map);
        } else {
            map.put("message", "user created successfully!");
            users.setMap(map);
        }

        return !userRepository.findByUsername(users.getUsername()).isPresent() ?
                userRepository.save(users) : users;
    }

    @Override
    public String auth(UserMapper userMapper) {
        return userRepository
                .findByUsernameAndPassword(userMapper.getUsername(),
                        userMapper.getPassword()).isPresent()
                ? "User Successfull Login !" : "Username or Password incorrect";
    }
}
