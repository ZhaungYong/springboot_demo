package com.zy.user.service;

import com.zy.user.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findUserByName(String username);
    User findById(Integer id);
}
