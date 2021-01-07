package com.youfan.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductTypeTest {
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
        return "hello";

    }

}
