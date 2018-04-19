package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WebFrontController {
	@RequestMapping("/front")
	public String frontindex(){
		return "web/index/index";
	}
	@RequestMapping("/front/teacher")
	public String article(){
		
		return "web/teacher/teacher_list";
	}
	@RequestMapping("/admin/index")
	public String adminindex(){
		return "common/index";
	}
	@RequestMapping("/admin/b")
	public String teacher(){
		return "admin/teacher/teacher";
	}
	@RequestMapping("/front/course")
	public String course(){
		return "web/course/courses-list";
	}
	@RequestMapping("/front/question")
	public String question(){
		return "web/questions/questions-list";
	}
}
