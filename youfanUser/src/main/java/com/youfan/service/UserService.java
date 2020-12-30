package com.youfan.service;

import com.youfan.dao.UserDao;
import com.youfan.entity.UserInfo;
import com.youfan.form.UserRegisterForm;
import com.youfan.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public UserInfo findUserByid(int userid){

        return userDao.findUserByid(userid);
    }
    public void saveUserInfo(UserRegisterForm userRegisterForm) throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount(userRegisterForm.getAccount());
        userInfo.setBirthday(userRegisterForm.getBirthday());
        userInfo.setTelphone(userRegisterForm.getTelphone());
        userInfo.setQq(userRegisterForm.getQq());
        userInfo.setWeixin(userRegisterForm.getWeinxin());
        String password = userRegisterForm.getPassword();
        userInfo.setOriginalPassword(password);
        userInfo.setEncryptionPassword(Md5Util.md5(password,Md5Util.md5key));
        userDao.saveUserInfo(userInfo);
    }

    public boolean verifyUserByAccount(UserRegisterForm userRegisterForm) throws Exception {
        String account = userRegisterForm.getAccount();
        String password = userRegisterForm.getPassword();
        UserInfo userInfo = userDao.findUserByAccount(account);
        String encryptionPassword = userInfo.getEncryptionPassword();
        boolean verify = Md5Util.verify(password, Md5Util.md5key, encryptionPassword);
        return verify;
    }
}
