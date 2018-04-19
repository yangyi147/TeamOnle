package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bean.EClass;
import com.bean.Users;
import com.mapper.Edu_ClassDao;
import com.service.EclassServiceImpl;
import com.service.UserServiceImpl;

@Controller
@RequestMapping("/admin/users")
public class UserController {
	@Autowired
        UserServiceImpl userServiceImpl; 
	@Autowired
	    EclassServiceImpl eclassServiceImpl;
	@RequestMapping("/list")
	public ModelAndView getlistAll() {
		ModelAndView mv = new ModelAndView();
		List<Users> list = userServiceImpl.getlistAll();
		List<EClass> listc=eclassServiceImpl.getlistAll();
		
		mv.addObject("listc", listc);
		mv.addObject("list", list);
		mv.setViewName("/common/student");
		return mv;	
	}

	@RequestMapping("/update")
     public String update(Users users) {
		userServiceImpl.update(users);
		return "redirect:/admin/users/list";
		
	}

	@RequestMapping("/updateid/{id}/{is_avalible}")
    public String updateid(@PathVariable("id")int id,@PathVariable("is_avalible")int is_avalible) {
		Users users = new Users();
		users.setUser_id(id);
	    if (is_avalible==0) {
	    	is_avalible=1;
	    	users.setIs_avalible(is_avalible);
		}else if (is_avalible==1) {
			is_avalible=0;
			users.setIs_avalible(is_avalible);
		}
		userServiceImpl.updateid(users);
		return "redirect:/admin/users/list";
	}
	@RequestMapping("/getSelect")
	@ResponseBody
	public List<Users> getSelect(Users users,HttpServletRequest request) {
		Map map = new HashMap<>();
		map.put("users", users);
		request.setAttribute("users", users);
		return userServiceImpl.getselect(map);
		
	}
	private Map init(HttpServletRequest request) {
		Map map = new HashMap<>();
		return map;
		
	}
}
