package com.chen.login.controller;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chen.login.model.LoginUser;
import com.chen.login.service.LoginUserService;
import com.chen.mail.MailSender;
import com.google.common.collect.Maps;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginController {


	@Resource
	LoginUserService loginUserService;
	@Inject
	MailSender mailSender;

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
		String salt = com.chen.util.StringUtils.randomString();
		String uid = loginUserService.insert(registerUser);


		//发送邮件激活，然后才能登陆。如果未激活不能登陆。
		Map<String, String> map = Maps.newHashMap();
		map.put("registerUrl","localhost:10010/login/register?email="+email+"&rsc="+encodeRegisterCode(email,password,salt));
		mailSender.send(email, map);
		return "redirect:/login/index";
	}

	@RequestMapping(value = "register" ,method = RequestMethod.GET)
	public String register(){
		return "redirect:/index";
	}

	private static String encodeRegisterCode(String email, String password, String salt){
		return DigestUtils.md5(email+password+salt).toString();
	}



}
