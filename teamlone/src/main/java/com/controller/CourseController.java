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
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Edu_Course;
import com.bean.Edu_Teacher;
import com.bean.Edu_course_Kpoint;
import com.bean.Sys_Subject;
import com.github.pagehelper.PageInfo;
import com.mapper.Edu_TeacherDao;
import com.service.Edu_CourseService;
import com.service.Edu_course_KpointService;
import com.service.Sys_Subjectervice;
import com.util.JsonUtils;

@Controller
@RequestMapping("/admin/course")
public class CourseController {
	@Autowired
	Edu_CourseService courseService;
	@Autowired
	Sys_Subjectervice subjectService;
	@Autowired
	Edu_course_KpointService course_KpointService;
	@Autowired
	Edu_TeacherDao teacherDao;
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
	@RequestMapping("/chapter/{id}/{aid}/{cid}")
	public String chapter(@PathVariable("id")int id,@PathVariable("aid")int aid,@PathVariable("cid")int cid,HttpServletRequest request) {
		List<Sys_Subject> allSubjictByparent_Id = subjectService.getAllSubjictByparent_Id(id);
		List<Sys_Subject> allSubjict = subjectService.getAllSubjict();
		Edu_Course courseByID = courseService.getCourseByID(cid);
		List<Edu_Teacher> allTeacher = teacherDao.getAllTeacher();
		System.out.println("allTeacher:"+allTeacher);
		request.setAttribute("allTeacher", allTeacher);
        request.setAttribute("courseByID", courseByID); 		
		request.setAttribute("allSubjictByparent_Id", allSubjictByparent_Id);
		request.setAttribute("allSubjict", allSubjict);
		request.setAttribute("aid",aid);
		request.setAttribute("id",id);
		return "/admin/Chapter";
	}
	@RequestMapping("/chapte/{id}")
	public String chapte(@PathVariable("id")int id,HttpServletRequest request) {
		List<Edu_course_Kpoint> allEdu_course_KpointByCourseID = course_KpointService.getAllEdu_course_KpointByCourseID(id);
		String json= JsonUtils.objectToJson(allEdu_course_KpointByCourseID);
		request.setAttribute("allEdu_course_KpointByCourseID", json);
		return "/admin/chapte";
	}
	@ResponseBody
	@RequestMapping("/getcourse")
	public List<Sys_Subject> getcourse(int id) {
		System.out.println("id:"+id);
		List<Sys_Subject> allSubjictByparent_Id = subjectService.getAllSubjictByparent_Id(id);
		System.out.println("allSubjictByparent_Id:"+allSubjictByparent_Id);
		return allSubjictByparent_Id;
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
