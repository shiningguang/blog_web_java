package com.chen.login.dao.impl;

import com.chen.common.db.dao.BaseDAOImpl;
import com.chen.login.dao.LoginAccountDao;
import com.chen.login.model.LoginAccount;
import org.springframework.stereotype.Repository;

/**
 * Author ： chen
 * Date ： 16/9/3
 * Time : 下午5:11
 */
@Repository("loginAccountDao")
public class LoginAccountDaoImpl extends BaseDAOImpl<LoginAccount,String> implements LoginAccountDao{
}
