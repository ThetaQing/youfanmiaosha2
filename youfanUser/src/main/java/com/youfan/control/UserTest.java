package com.youfan.control;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserTest {

    //@Autowired
    @RequestMapping(value = "sayHelloWorld",method = RequestMethod.GET)
    //@ResponseBody
    public String sayHelloWorld(HttpServletRequest req){
        String remoteAddr = req.getRemoteAddr();
        return "hello"+remoteAddr+"!!!";

    }

}
