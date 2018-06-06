package com.bsoft.service.impl;

import com.bsoft.mapper.UserMapper;
import com.bsoft.pojo.User;
import com.bsoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable(value = "allUsers")
    public List<User> findAll() {
        System.out.println("未走缓存");
        return userMapper.findAll();
    }

    @Override
    public User findUserByName(String username) {
        return userMapper.findUserByName(username);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
