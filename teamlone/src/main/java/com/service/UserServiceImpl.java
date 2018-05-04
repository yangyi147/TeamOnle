package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Users;
import com.mapper.UserDao;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
    UserDao userdao;
	@Override
	public void insave(Users users) {
		// TODO Auto-generated method stub
		 userdao.insave(users);
	}

	@Override
	public List<Users> getlistAll(Map map) {
		// TODO Auto-generated method stub
		List<Users> list = userdao.getlistAll(map);
	
		return list;
	}

	@Override
	public void update(Users users) {
		// TODO Auto-generated method stub
		userdao.update(users);
		
	}

	@Override
	public Users getById(int id) {
		// TODO Auto-generated method stub
		Users users = userdao.getById(id);
		return users;
	}

	@Override
	public void updateid(Users users) {
		// TODO Auto-generated method stub
		userdao.updateid(users);;
	}





}
