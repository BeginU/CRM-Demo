package com.example.demo.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

/** 
 * @author  lmm 
 * @date 2018-2-7 上午8:52:16 
 */
public class UserTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void saveUser(){
		User user = new User();
		user.setUserId(1);
		user.setPassword("123");
		user.setUserName("admin");
		user.setPhone("18262616954");
		userService.saveUser(user);
	}
}
