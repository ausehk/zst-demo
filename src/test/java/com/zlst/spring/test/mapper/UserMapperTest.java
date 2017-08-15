package com.zlst.spring.test.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zlst.spring.entity.UserVo;
import com.zlst.spring.mapper.UserMapper;
import com.zlst.spring.BaseTest;
import com.zlst.spring.query.UserQuery;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 用户持久化测试
 * auther hekai
 * create 2017/8/14 15:42
 */
public class UserMapperTest extends BaseTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void queryUserInfoById(){
       UserVo userVo= userMapper.queryUserInfoById("2");
       System.out.println(userVo.getUserName());

    }
     @Test
    public void queryUserList() {
        UserQuery userQuery =new UserQuery();
        PageHelper.startPage(userQuery.getPageNumber(),userQuery.getPageSize());
        List<UserVo> userList = userMapper.queryUserList(userQuery);
        System.out.println(userList);
        System.out.println(userList.get(0));
    }



}
