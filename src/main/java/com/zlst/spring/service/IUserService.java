package com.zlst.spring.service;

import com.zlst.spring.entity.UserVo;
import com.zlst.spring.query.UserQuery;

import java.util.List;

/**
 * 用户业务层
 * auther hekai
 * create 2017/8/14 17:17
 */
public interface IUserService {
     /**
      * 根据ID查询用户信息
      * @param id
      * @return
      */
     UserVo queryUserInfoById (String id);

     /**
      * 分页查询用户信息
      * @param query
      * @return
      */
     public List<UserVo> queryUserList(UserQuery query);
}
