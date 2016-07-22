package com.chen.login.dao.impl;

import org.springframework.stereotype.Repository;

import com.chen.common.db.dao.BaseDAOImpl;
import com.chen.login.dao.LoginUserDao;
import com.chen.login.model.LoginUser;

@Repository("loginUserDao")
public class LoginUserDaoImpl extends BaseDAOImpl<LoginUser, String> implements LoginUserDao {

}
