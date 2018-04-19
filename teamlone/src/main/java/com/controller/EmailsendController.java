package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Emailsend;
import com.service.EmailsendServiceImpl;

@Controller
@RequestMapping("/admin/email")
public class EmailsendController {
	@Autowired
	   EmailsendServiceImpl emailsendServiceImpl;
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mv =new ModelAndView();
		List<Emailsend> list = emailsendServiceImpl.getlistAll();
		mv.setViewName("/common/emailsend");
		mv.addObject("list", list);
		return mv;
		
	}

}
