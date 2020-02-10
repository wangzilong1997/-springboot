package com.imooc.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
/**
 * @author wangzilong
 * @date 2020/2/6 15:24
 */
public class User {
    //以格式返回数据
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss a", locale="zh" ,timezone="GMT+8")
    private Date birthday;

    //除去不是空的
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String desc;
    private Integer age;
    @JsonIgnore
    private String password;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }



    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}



