package com.bsoft.controller;

import com.bsoft.pojo.User;
import com.bsoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getString")
    public String getString() {
        return "hello springboot";
    }

    @RequestMapping("getPojo")
    public User getUser() {
        User user = new User();
        user.setId("1");
        user.setName("zy");
        user.setAddress("tj");
        return user;
    }

    @RequestMapping("getAllUser")
    public List<User> getAllUser() {
        return userService.findAll();
    }
}
