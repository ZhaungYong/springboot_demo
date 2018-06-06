package com.bsoft.service;

import com.bsoft.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findUserByName(String username);
    User findById(Integer id);
}
