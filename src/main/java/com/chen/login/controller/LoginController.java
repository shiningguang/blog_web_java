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
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {


	@Resource
	LoginUserService loginUserService;


	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response,ModelMap model){
		LoginUser u = loginUserService.findUserByid("chen");
		System.err.print(u);
		return "login/index";
	}

	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String register(HttpServletRequest request, HttpServletResponse response,ModelMap model){
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		LoginUser registerUser = new LoginUser();
		registerUser.setName(email);
		registerUser.setEmail(email);
		loginUserService.save(registerUser);
		return "redirect:/login/index";
	}




}
