package com.bsoft.mapper;

import com.bsoft.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> findAll();
    User findUserByName(String username);
    User findById(Integer id);
}
