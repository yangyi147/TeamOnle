package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Questions_comment;
import com.service.Questions_commentService;
@Controller
@RequestMapping("/front")
public class Questions_commentWebController {
	
	@Autowired
	private Questions_commentService questions_commentService;
	@RequestMapping("/Questionslist")
	public ModelAndView listQuestionList(){
		Map map=new HashMap<>();
		List<Questions_comment>  qc=questions_commentService.getlistAll(map);
		ModelAndView md=new ModelAndView();
		md.addObject("questionsList", qc);
		md.setViewName("/web/questions/questions-list");
		return md;
	}
	

}
