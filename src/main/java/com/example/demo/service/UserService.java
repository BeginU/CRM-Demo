package com.example.demo.service;

import com.example.demo.model.User;

/** 
 * @author  lmm 
 * @date 2018-2-6 下午6:55:30 
 */
public interface UserService {
	
	public void saveUser(User user);
	
	public User queryByUserName(String userName);
}
