package com.zlst.spring.service.impl;

import com.zlst.spring.entity.UserVo;
import com.zlst.spring.mapper.UserMapper;
import com.zlst.spring.query.UserQuery;
import com.zlst.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 * auther hekai
 * create 2017/8/14 17:20
 */
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserVo queryUserInfoById(String id) {
        return userMapper.queryUserInfoById(id);
    }

    @Override
    public List<UserVo> queryUserList(UserQuery query) {
        return userMapper.queryUserList(query);
    }
}
