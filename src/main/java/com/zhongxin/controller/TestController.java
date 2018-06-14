package com.zhongxin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhongxin.pojo.Authority;
import com.zhongxin.service.test;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private test test;
	@RequestMapping("/getAll")
	@ResponseBody 
	public List<Authority> getAllAuthority() {
		return test.getAllAuthority();
		
	}
}
