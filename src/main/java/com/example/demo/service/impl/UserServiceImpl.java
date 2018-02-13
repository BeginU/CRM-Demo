package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.utils.MD5Utils;
import com.example.demo.dao.daointerface.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

/** 
 * @author  lmm 
 * @date 2018-2-6 下午6:55:10 
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void saveUser(User user) {
		String password = MD5Utils.md5(user.getPassword());
		user.setPassword(password);
		userMapper.insert(user);		
	}
	
	@Override
	public User queryByUserName(String userName) {
		return userMapper.selectByUserName(userName);				
	}
	
	/*@Override
	public User queryByUserName(User user) {
		String password = MD5Utils.md5(user.getPassword());
		user.setPassword(password);
		userMapper.insert(user);		
	}*/

}
