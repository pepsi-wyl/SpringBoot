package com.pepsiwyl.controller;

import com.pepsiwyl.mapper.UserMapper;
import com.pepsiwyl.pojo.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-03-18 16:22
 */

@RestController
public class UserController {
    final UserMapper userMapper;

    public UserController(@Qualifier("userMapper") UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/user")
    public List<User> json() {
        return userMapper.getUserList();
    }

}
