package com.chen.login.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chen.login.model.LoginUser;
import com.chen.login.service.LoginUserService;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {


	@Resource
	LoginUserService loginUserService;

	@Resource(name="mainPropertyConfigurer")
	PropertyPlaceholderConfigurer configurer;

	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response,ModelMap model){
		LoginUser u = loginUserService.findUserByid("chen");
		System.out.print(u);
		return "login/index";
	}



}
