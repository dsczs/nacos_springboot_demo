package com.nacos.demo.service.impl;

import com.nacos.demo.mapper.UserMapper;
import com.nacos.demo.model.User;
import com.nacos.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
}
