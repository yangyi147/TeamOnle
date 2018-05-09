package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Users;
import com.service.UserServiceImpl;
import com.util.MD5Utils;
import com.util.Result;

@Controller

public class LoginController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	

	private static final String getKopintHtml = "/web/course/videocode";// �γ̲���
	// 前台登录
	@RequestMapping("/front/login")
	@ResponseBody
	public Result frontLogin(HttpServletRequest request,
			HttpServletResponse response,HttpSession session) {
		
		String userName = request.getParameter("account");
		String pwd = request.getParameter("password");
		Result result = new Result();
		if (pwd == null && "".equals(pwd)) {
			result.setMessage("");
			result.setSuccess(false);
			return result;
		}
		pwd = MD5Utils.md5(pwd);
		String ipForget = request.getParameter("ipForget");
		Users edu_User = userServiceImpl.getPwd(userName);
		System.out.println(edu_User+"tryuioo");
		if (edu_User.getPassword().equals(pwd)) {
			result.setMessage("");
			result.setSuccess(true);
			session.setAttribute("login_success", edu_User);
			Users user=(Users)session.getAttribute("login_success");
			System.out.println("login:"+user);
			return result;
		}
		return result;
	}
	@RequestMapping("/uc/getloginUser")
	@ResponseBody
	public Result getLoginUser(HttpSession session,HttpServletResponse response) {
		
		Users edu_User = (Users) session.getAttribute("login_success");
		if (edu_User == null) {
			return new Result(false, null, null);
		}else {
			return new Result(true, null, edu_User);
		}
	}
	@RequestMapping("/uc/exit")
	@ResponseBody
	public Result exitUser(HttpSession session) {
		session.removeAttribute("login_success");
		return new Result();
	}
	
	@RequestMapping("/uc/createuser")
	@ResponseBody
	public Result createUser(HttpServletRequest request) {
		Users user = new Users();
		user.setEmail(request.getParameter("user.email"));
		user.setPassword(MD5Utils.md5(request.getParameter("user.password")));
		user.setMobile(request.getParameter("user.mobile"));
		userServiceImpl.addUser(user);
		return new Result(true, null, null);
	}
}
