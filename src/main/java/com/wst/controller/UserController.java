package com.wst.controller;

import com.wst.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController     /*RestController = @Controller + @RestController*/
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser1")
    //@ResponseBody
    public Object getUser(){

        User user = new User();
        user.setName("王慎涛1314");
        user.setAge(27);
        user.setBirthday(new Date());
        user.setPassword("1234567");
        user.setDesc("描述美好的一天！");

        return user;
    }

}
