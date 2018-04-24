package com.controller;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Subjects;
import com.bean.Teacher;
import com.github.pagehelper.PageInfo;
import com.service.SubjectsService;
import com.service.TeacherService;
import com.util.InfoNode;
import com.util.JsonUtils;
@Controller
@RequestMapping("/admin")
public class TeacherController {
	
	@Autowired
	private SubjectsService subjectService;
	@Autowired
	private TeacherService teacherService;
	@RequestMapping("/teacher")
    public ModelAndView findall(@RequestParam(name="page",defaultValue="0")int page,HttpServletRequest request) {
		ModelAndView md=new ModelAndView();
		Map map=inerMap(request);
		PageInfo<Teacher> tc=teacherService.getlistAll(map,page);
		md.addObject("tc", tc);
		md.setViewName("/admin/teacher/teacher");
		return md;
	}
	@RequestMapping("/delTe/{id}")
	public String  delTe(@PathVariable("id")int id){
		teacherService.delTe(id);
		return "redirect:/admin/teacher";
	}
	@RequestMapping("/teacher/getById/{id}")
	public ModelAndView  getById(@PathVariable("id")int id){
		Teacher teacher=teacherService.getById(id);
		ModelAndView md=new ModelAndView();
		md.addObject("te", teacher);
		System.out.println(teacher);
		List<Subjects> su=subjectService.getListAll();
		String json=JsonUtils.objectToJson(su);
		md.addObject("su", json);
		md.setViewName("/admin/teacher/upteacher");
		return md;
	}
	private Map inerMap(HttpServletRequest request){
	 String startdate=request.getParameter("startdate");
	 String  stopdate=request.getParameter("stopdate");
	 Map map=new HashMap<>();
	 String  id=request.getParameter("tid");
	 String pname=request.getParameter("qname");
	 String ptype=request.getParameter("qtype");
	 String  ptname=request.getParameter("th_name");
	 System.out.println(startdate);
	 System.out.println(stopdate);
	 System.out.println(id);
	 System.out.println(pname);
	 System.out.println(ptype);
	 System.out.println(ptname);
		request.setAttribute("qtype", ptype);
		if (id==null) {
			id="-1";
		}
		map.put("id", id);
		map.put("qtype", ptype);
		request.setAttribute("qname", pname);
		request.setAttribute("qtname", ptname);
		map.put("qname", pname);
		map.put("qtname", ptname);
		map.put("startdate", startdate);
		map.put("stopdate", stopdate);
		request.setAttribute("startdate", startdate);
		request.setAttribute("stopdate", stopdate);
		return map;
	}
	
	
	 @RequestMapping(value="/upload",method=RequestMethod.POST)
     public String upload(HttpServletRequest request,
            @RequestParam("file") MultipartFile file,Teacher teacher,@RequestParam("sd")int sd) throws Exception {
		 if(!file.isEmpty()) {
        	Date day=new Date();    
            String path = request.getRealPath("/images/");
            String filename = file.getOriginalFilename();
            File filepath = new File(path,filename);
   		    Subjects sub=subjectService.getById(sd);
            teacher.setPic_path("/images/"+filename);
            teacher.setSubject_id(sub);
            teacher.setCreate_time(day);
            teacher.setUpdate_time(day);
            teacherService.inTer(teacher);
            if (!filepath.getParentFile().exists()) { 
                filepath.getParentFile().mkdirs();
            }
            file.transferTo(new File(path + File.separator + filename));
            return "redirect:/admin/teacher";
        } else {
        	System.out.println("=====================");
            return "";
        }
     }
	 @RequestMapping(value="/uploadfind")
	 @ResponseBody
     public InfoNode uploadw(HttpServletRequest request,
    		 @RequestParam("file")MultipartFile  file) throws Exception {
		 InfoNode node=new InfoNode();
		 if(!file.isEmpty()) {
            String path = request.getRealPath("/images/");
            String filename =  file.getOriginalFilename();
            System.out.println("name:"+filename);
            File newfile = new File(path,filename);
            if (!newfile.exists()) { 
            	newfile.createNewFile();
            }
            file.transferTo(newfile);
            node.setCode("1");
            node.setUrl(filename);
            return node;
        } else {
        	System.out.println("=====================");
            return node;
        }
     }
	@RequestMapping(value="/upTer")
	   public String upTer(Teacher teacher,@RequestParam("sd")int sd) throws Exception {
        	Date day=new Date();    
   		    Subjects sub=subjectService.getById(sd);
   		    teacher.setPic_path("/images/"+teacher.getPic_path());
            teacher.setSubject_id(sub);
            teacher.setUpdate_time(day);
            teacherService.upTer(teacher);
			return "redirect:/admin/teacher";
	 }
	
}
