package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Edu_Course;
import com.bean.Sys_Subject;
import com.github.pagehelper.PageInfo;
import com.service.Edu_CourseService;
import com.service.Sys_Subjectervice;

@Controller
@RequestMapping("/admin/course")
public class CourseController {
	@Autowired
	Edu_CourseService courseService;
	@Autowired
	Sys_Subjectervice subjectService;
	@RequestMapping("/list")
	public String list(@RequestParam(name="page",defaultValue="0")int page,HttpServletRequest request) {
		Map map=init(request);
		PageInfo<Edu_Course> allEnd_Course = courseService.getAllEnd_Course(map, page);
		List<Sys_Subject> allSubjict = subjectService.getAllSubjict();
		request.setAttribute("allSubjict", allSubjict);
		request.setAttribute("allEnd_Course", allEnd_Course);
		request.setAttribute("map", map);
		return "/admin/CourseManagement";
	}
	@RequestMapping("/chapter/{id}/{aid}")
	public String chapter(@PathVariable("id")int id,@PathVariable("aid")int aid,HttpServletRequest request) {
		System.out.println("id:"+id);
		System.out.println("aid:"+aid);
		List<Sys_Subject> allSubjictByparent_Id = subjectService.getAllSubjictByparent_Id(id);
		List<Sys_Subject> allSubjict = subjectService.getAllSubjict();
		System.out.println("allSubjict:"+allSubjict);
		request.setAttribute("allSubjictByparent_Id", allSubjictByparent_Id);
		request.setAttribute("allSubjict", allSubjict);
		request.setAttribute("aid",aid);
		request.setAttribute("id",id);
		return "/admin/Chapter";
	}
	
	@SuppressWarnings("deprecation")
	private Map init(HttpServletRequest request){
		Map map =new HashMap<>();
		String name =  request.getParameter("name");
		if (name!=null&&name.trim().length()!=0) {
			map.put("name",name);
		}
		String zid = request.getParameter("ztid");
		System.out.println("zid:"+zid);
		if (zid!=null&&zid.trim().length()>0) {
			int ztid= Integer.parseInt(zid);
			map.put("ztid",ztid);
		}
		String zyids = request.getParameter("zyid");
		if (zyids!=null&&zyids.trim().length()!=0) {
			int zyid=Integer.parseInt(zyids);
			map.put("zyid",zyid);
		}
		String parameter = request.getParameter("stattime");
		if (parameter!=null&&parameter.trim().length()!=0) {
			map.put("stattim", parameter);
		}
		String endtime = request.getParameter("endtime");
		if (endtime!=null&&endtime.trim().length()!=0) {
			map.put("endtime", endtime);
		}
		return map;
	}

}
