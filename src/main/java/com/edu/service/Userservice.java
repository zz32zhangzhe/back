package com.edu.service;

import com.edu.dao.UserMapper;
import com.edu.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Userservice implements Iuserservice{
    @Resource
    UserMapper userMapper;
    @Override
    public int add(User user) {
        return userMapper.insertSelective(user);
    }
}
