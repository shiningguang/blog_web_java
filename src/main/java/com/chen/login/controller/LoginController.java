package com.chen.login.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chen.login.dao.LoginUserDao;
import com.chen.login.model.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {


	@Resource
	private LoginUserDao loginUserDao;

	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response,ModelMap model){
		LoginUser u = loginUserDao.find("chen");
		System.out.print(u);
		return "login/index";
	}



}
