package com.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Sys_User;
import com.mapper.Sys_UserDao;
@Service
public class Sys_UserServiceImpl implements Sys_UserService {

	@Autowired
	Sys_UserDao userDao;
	@Autowired
	Sys_UserService userService;
	@Override
	public Sys_User getUserByName(String name) {
		// TODO Auto-generated method stub
		return userDao.getUserByName(name);
	}
	@Override
	public Set<String> getUserByUserName(String name) {
		Sys_User userByName = userService.getUserByName(name);
		Set<String> str=new HashSet<>();
		str.add(userByName.getLOGIN_NAME());
		return str;
	}

}
