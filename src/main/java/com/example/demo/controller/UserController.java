package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.utils.MD5Utils;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

/** 
 * @author  lmm 
 * @date 2018-2-6 下午6:52:16 
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/register/add_user",method=RequestMethod.POST)
	public String addUser(HttpServletRequest request,@RequestBody User user){
		userService.saveUser(user);
		return "system/login";
	}
	
	@RequestMapping(value="/user/query_user",method=RequestMethod.GET)
	@ResponseBody
	public Boolean queryByName(HttpServletRequest request,String userName){
		User user = userService.queryByUserName(userName);
		return user == null ? true: false;
	}
	
	@RequestMapping(value="/user/query_user_two",method=RequestMethod.GET)
	@ResponseBody
	public Boolean queryByNameTwo(HttpServletRequest request,String userName){
		User user = userService.queryByUserName(userName);
		return user != null ? true: false;
	}
	
	//用户登录
	@RequestMapping(value="/user/login",method=RequestMethod.POST)
	@ResponseBody
	public Boolean userLogin(HttpServletRequest request,@RequestBody User user){
		User tempUser = userService.queryByUserName(user.getUserName());
			if(tempUser.getPassword().equals(MD5Utils.md5(user.getPassword()))){
				return true;
			}else{
				return false;
			}					
		}
	
}
