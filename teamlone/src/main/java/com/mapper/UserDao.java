package com.mapper;

import java.util.List;
import java.util.Map;

import com.bean.Users;

public interface UserDao {
          void insave(Users users);
          List<Users> getlistAll();
          void update(Users users);
          Users getById(int id);
          void updateid(Users users);
          List<Users> getselect(Map map);
          
}
