package com.newland.balbaxmx.simpletemple.service.impl;

import com.newland.balbaxmx.simpletemple.mapper.UserMapper;
import com.newland.balbaxmx.simpletemple.module.User;
import com.newland.balbaxmx.simpletemple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhangyh
 * @ClassName: UserServiceImpl
 * @Date: 2020/1/14 20:24
 * @Operation:
 * @Description: ${description}
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selectAll() {
        return userMapper.selectUser();
    }
}
