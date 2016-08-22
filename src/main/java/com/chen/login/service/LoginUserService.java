package com.chen.login.service;

import com.chen.login.model.LoginUser;

/**
 * Author ： chen
 * Date ： 16/7/26
 * Time : 上午12:08
 */
public interface LoginUserService {

    LoginUser findUserByid(String uid);

}
