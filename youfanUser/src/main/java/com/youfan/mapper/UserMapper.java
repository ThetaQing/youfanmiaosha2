package com.youfan.mapper;

import com.youfan.entity.UserInfo;

public interface UserMapper {
    public UserInfo findUserByid(int userid);
    public void saveUserInfo(UserInfo userInfo);
    public UserInfo findUserByAccount(String account);

}
