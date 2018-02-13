package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * @author  lmm 
 * @date 2018-2-6 下午1:35:35 
 */

@Controller
public class LoginController {
	
	//登录页
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	//注册
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(){
		return "registers";
	}
	
	
	
	//登陆成功
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(){
		return "index";
	}
	
}
