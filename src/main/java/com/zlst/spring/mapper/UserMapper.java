package com.zlst.spring.mapper;

import com.zlst.spring.entity.UserVo;
import com.zlst.spring.query.UserQuery;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户持久化层
 * auther hekai
 * create 2017/8/14 15:24
 */
@Component
public interface UserMapper {
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
