package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Edu_Course;
import com.bean.Teacher;
import com.github.pagehelper.PageInfo;
import com.service.Edu_CourseService;
import com.service.TeacherService;
@Controller
@RequestMapping("/front/teacher")
public class TeacherWebcontroller {
	@Autowired
	private Edu_CourseService edu_CourseService;
	@Autowired
	private TeacherService teacherService;
    @RequestMapping("/list")
	public ModelAndView article(@RequestParam(name="page",defaultValue="0")int page){
		  Map map=new HashMap<>();
//		  PageInfo<Edu_Course> ts=edu_CourseService.getAllEnd_Course(map, page);
    	ModelAndView md=new ModelAndView();
    	PageInfo<Teacher> th=teacherService.getlistAll(map, page);
    	md.addObject("th",th);
//    	md.addObject("subjectList", ts);
    	md.setViewName("/web/teacher/teacher_list");
		return md;
	}
    @RequestMapping("/listone/{id}")
    public ModelAndView listone(@PathVariable("id")int id){
    	ModelAndView md=new ModelAndView();
    	 Teacher  teacher=teacherService.getById(id);
    	 md.addObject("th", teacher);
    	 md.setViewName("/web/teacher/teacher_info");
		 return md;
    }
}
