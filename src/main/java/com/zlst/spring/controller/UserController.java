package com.zlst.spring.controller;

import com.zlst.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户控制层
 * auther hekai
 * create 2017/8/15 9:53
 */
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/getUser")
    public Object getUserInfo(){

        return userService.queryUserInfoById("2");
    }
}
