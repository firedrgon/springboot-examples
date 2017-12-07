package com.hong.service;

import com.github.pagehelper.PageHelper;
import com.hong.domain.User;
import com.hong.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hong on 2017/4/25.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        //分页
        PageHelper.startPage(0, 1);
        return userMapper.selectAll();
    }
}
