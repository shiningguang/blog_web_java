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

    /**
     * 根据uid查找用户
     * @param uid
     * @return
     */
    public LoginUser findUserByid(String uid){
        return loginUserDao.find(uid);
    }

    /**
     * 更新注册用户信息
     *
     * @param registerUser
     */
    @Override
    public void save(LoginUser registerUser) {
        loginUserDao.save(registerUser);
    }

    /**
     * 保存注册用户信息
     *
     * @param registerUser
     */
    @Override
    public String insert(LoginUser registerUser) {
        return loginUserDao.insert(registerUser);
    }

}
