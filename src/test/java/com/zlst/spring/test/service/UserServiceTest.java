package com.zlst.spring.test.service;

import com.github.pagehelper.PageHelper;
import com.zlst.spring.BaseTest;
import com.zlst.spring.entity.UserVo;
import com.zlst.spring.query.UserQuery;
import com.zlst.spring.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 用户业务测试类
 * auther hekai
 * create 2017/8/14 17:24
 */
public class UserServiceTest extends BaseTest {
    @Autowired
    private IUserService userService;

     @Test
    public void queryUserInfoById(){
       UserVo userVo= userService.queryUserInfoById("2");
       System.out.println(userVo.getUserName());

    }
     @Test
    public void queryUserList() {
        UserQuery userQuery =new UserQuery();
        PageHelper.startPage(userQuery.getPageNumber(),userQuery.getPageSize());
        List<UserVo> userList = userService.queryUserList(userQuery);
        System.out.println(userList);
        System.out.println(userList.get(0));


    }
}
