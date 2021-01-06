package com.youfan.control;

import com.youfan.entity.UserInfo;
import com.youfan.form.UserRegisterForm;
import com.youfan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("userControl")
public class UserControl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "findUserById",method = RequestMethod.GET)
    public String findUserById(int id, Model model){
        UserInfo userInfo = userService.findUserByid(id);
        model.addAttribute("userInfo",userInfo);
        return "viewUser";

    }
    @RequestMapping(value = "toRegisterUser",method = RequestMethod.GET)
    public String toRegisterUser(){
        return "toRegisterUser";

    }

    @RequestMapping(value = "registerUser",method = RequestMethod.POST)
    public String registerUser(UserRegisterForm userRegisterForm, Model model){
       if(StringUtils.isEmpty(userRegisterForm.getAccount())){
           model.addAttribute("error","用户名不能为空");
           return "toRegisterUser";
       }
        if(StringUtils.isEmpty(userRegisterForm.getPassword()) || StringUtils.isEmpty(userRegisterForm.getRepassword())){
            model.addAttribute("error","密码不能为空");
            return "toRegisterUser";
        }
        if(!userRegisterForm.getPassword().equals(userRegisterForm.getRepassword())){
            model.addAttribute("error","两次密码输入不一致");
            return "toRegisterUser";
        }
        System.out.println("registerUser");
        System.out.println(userRegisterForm.getAccount());
        System.out.println(userRegisterForm.getPassword());
        System.out.println(userRegisterForm.getRepassword());
        System.out.println(userRegisterForm.getBirthday());
        System.out.println(userRegisterForm.getTelphone());

        try {
            userService.saveUserInfo(userRegisterForm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //model.addAttribute("userInfo",userRegisterForm);  // 表单中的weinxin和userInfo中的weixin是不一致的，所以在填充viewUser.html的时候会报错，
        // 报错内容：Exception evaluating SpringEL expression: "userInfo.account" (template: "viewUser" - line 17, col 19)
        return "viewUser";

    }

    @RequestMapping(value = "toLogin",method = RequestMethod.GET)
    public String toLogin(){
        return "toLogin";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(UserRegisterForm userRegisterForm, Model model){

        if(StringUtils.isEmpty(userRegisterForm.getAccount())){
            model.addAttribute("error","用户名不能为空");
            return "toLogin";
        }
        if(StringUtils.isEmpty(userRegisterForm.getPassword())){
            model.addAttribute("error","密码不能为空");
            return "toLogin";
        }
        try {
            if(!userService.verifyUserByAccount(userRegisterForm)){
                model.addAttribute("error","密码错误");
                return "toLogin";
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "toLogin";

    }

}
