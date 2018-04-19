package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Subjects;
import com.service.SubjectsService;
import com.util.JsonUtils;
@Controller
@RequestMapping("/admin")
public class SubjectsController {
	@Autowired  
	private SubjectsService subjectsService;
	@RequestMapping("/getSuAll")
	public ModelAndView  getlistAll(){
		ModelAndView md=new ModelAndView();
		List<Subjects> su=subjectsService.getListAll();
		String json=JsonUtils.objectToJson(su);
		System.out.println(json);
		md.addObject("su", json);
        md.setViewName("/admin/teacher/addteacher");		
		return md;
	}
}
