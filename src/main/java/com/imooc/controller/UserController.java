package com.imooc.controller;

import com.imooc.pojo.User;
import com.imooc.pojo.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Date;

/**
 * @author wangzilong
 * @date 2020/2/6 13:02
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    @ResponseBody
    public User hello(){
        User u = new User();
        u.setName("dashhh321sdasdsdasdsdasd反击321hh55");
        u.setBirthday(new Date());
        u.setPassword("7777");
        u.setDesc(null);
        return u;
    }

    @RequestMapping("/JSONResult")
    @ResponseBody
    public JSONResult JSONResult(){
        User u = new User();
        u.setName("wangshuaishuai");
        u.setBirthday(new Date());
        u.setAge(12);
        u.setPassword("7777");
        u.setDesc("hello mooc2");
        return JSONResult.ok(u);
    }
}
