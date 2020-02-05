package com.leyue.admin.mapper;


import com.leyue.admin.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public void insert(User user);
    public User select(String username);
}
