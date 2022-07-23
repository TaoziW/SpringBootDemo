package com.wst.controller;

import com.wst.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@RestController     /*RestController = @Controller + @RestController*/
@RequestMapping("/user")
public class UserController {

    private String name;

    @RequestMapping(value = "/getUser1", method = RequestMethod.GET)
    public Object getUser(HttpServletResponse response, String nameCom){

        User user = new User();
        user.setName(nameCom + "王慎涛1314");
        user.setAge(27);
        user.setBirthday(new Date());
        user.setPassword("1234567");
        user.setDesc("描述美好的一天！");
        Cookie cookie = new Cookie("cookie", "12893892839238782382738248923465");
        response.addCookie(cookie);
        System.out.println(response.getHeaderNames() + "--------"  + response.getBufferSize());

        return user;
    }

}
