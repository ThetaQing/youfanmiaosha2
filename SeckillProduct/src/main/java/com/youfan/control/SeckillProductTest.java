package com.youfan.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeckillProductTest {
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(){
        return "测试成功";
    }

}
