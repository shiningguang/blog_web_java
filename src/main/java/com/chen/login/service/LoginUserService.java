package com.chen.login.service;

import com.chen.login.model.LoginUser;

/**
 * Author ： chen
 * Date ： 16/7/26
 * Time : 上午12:08
 */
public interface LoginUserService {

    /**
     * 根据uid查找用户
     * @param uid
     * @return
     */
    LoginUser findUserByid(String uid);

    /**
     * 保存注册用户信息
     * @param registerUser
     */
    void save(LoginUser registerUser);
}
