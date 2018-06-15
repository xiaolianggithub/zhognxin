package com.zhongxin.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhongxin.pojo.User;
@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping("/user")
	@ResponseBody
	public User login(@RequestBody User user, HttpSession session) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getLoginName(), user.getPassword());
		try {
			subject.login(token);
			User principal = (User) subject.getPrincipal();
			session.setAttribute("user", principal);
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return user;
		}
		return user;
	}
}
