package com.github.audience.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.audience.entity.User;
import com.github.audience.mapper.UserMapper;
import com.github.audience.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author audience7510
 * @Date 2022/7/11
 * @ClassName UserServiceImpl
 * @Description
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;
}
