package com.youfan.control;

import com.alibaba.fastjson.JSONObject;
import com.youfan.entity.UserInfo;
import com.youfan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("userControl")
public class UserControl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "findUserById",method = RequestMethod.GET)
    public String findUserById(int id){
        UserInfo userByid = userService.findUserByid(id);
        String result = JSONObject.toJSONString(userByid);
        return result;

    }
    @RequestMapping(value = "sayHelloWorld2",method = RequestMethod.GET)
    public String sayHelloWorld2(HttpServletRequest req){
        String remoteAddr = req.getRemoteAddr();
        return "hello"+remoteAddr+"!!!";

    }

}
