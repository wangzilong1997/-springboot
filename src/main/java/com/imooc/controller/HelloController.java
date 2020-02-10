package com.imooc.controller;

import com.imooc.pojo.JSONResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.Recource;

/**
 * @author wangzilong
 * @date 2020/2/6 13:02
 */
@RestController
public class HelloController {

    @Autowired
    private Recource recource;

    @RequestMapping("/hello")
    public Object hello(){
        return "hello springboot";
    }

    @RequestMapping("/getRecource")
    public JSONResult getResource(){
        Recource bean = new Recource();
        BeanUtils.copyProperties(recource,bean);

        return JSONResult.ok(bean);
    }
}
