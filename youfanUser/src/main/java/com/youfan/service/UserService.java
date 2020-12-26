package com.youfan.service;

import com.youfan.dao.UserDao;
import com.youfan.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public UserInfo findUserByid(int userid){

        return userDao.findUserByid(userid);
    }
}
