package com.zlst.spring.query;

import com.zlst.spring.common.query.BaseQuery;

/**
 * ${DESCRIPTION}
 * auther hekai
 * create 2017/8/14 16:13
 */
public class UserQuery extends BaseQuery {

     private String id;

    private String userName;

    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
