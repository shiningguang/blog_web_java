package com.chen.login.service.impl;

import com.chen.login.dao.LoginUserDao;
import com.chen.login.model.LoginUser;
import com.chen.login.service.LoginUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author ： chen
 * Date ： 16/7/26
 * Time : 上午12:09
 */
@Service("loginUserService")
public class LoginUserServiceImpl implements LoginUserService {

    @Resource
    private LoginUserDao loginUserDao;

    public LoginUser findUserByid(String uid){
        return loginUserDao.find(uid);
    }

}
