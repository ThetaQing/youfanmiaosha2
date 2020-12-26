package com.youfan.dao;

import com.youfan.entity.UserInfo;
import com.youfan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public UserInfo findUserByid(int userid){

        return userMapper.findUserByid(userid);
    }

}
