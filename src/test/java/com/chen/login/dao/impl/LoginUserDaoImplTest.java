package com.chen.login.dao.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chen.login.dao.LoginUserDao;
import com.chen.login.model.LoginUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:com.chen.context.xml" })
public class LoginUserDaoImplTest {

	@Resource(name = "loginUserDao")
	public LoginUserDao loginUserDao;
	
	@Test
	public void test() {
		LoginUser u =loginUserDao.find("chen");
		System.err.println(u);
	}

}
