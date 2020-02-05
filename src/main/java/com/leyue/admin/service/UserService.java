package com.leyue.admin.service;


import com.leyue.admin.domain.entity.User;

public interface UserService {
    public void add(User user);
    public User find(String username);
}
