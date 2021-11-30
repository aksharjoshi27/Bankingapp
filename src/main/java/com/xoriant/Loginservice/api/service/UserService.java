package com.xoriant.Loginservice.api.service;

import com.xoriant.Loginservice.api.entity.Users;
import com.xoriant.Loginservice.api.mapper.UserMapper;

/**
 * @Author rohit
 * @Date 30/11/21
 **/
public interface UserService {
    Users create(Users users);
    String auth(UserMapper userMapper);
}
