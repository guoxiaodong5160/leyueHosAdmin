package com.leyue.admin.service.impl;

import com.leyue.admin.mapper.UserMapper;
import com.leyue.admin.domain.entity.User;
import com.leyue.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public User find(String username) {
        return userMapper.select(username);
    }
}
