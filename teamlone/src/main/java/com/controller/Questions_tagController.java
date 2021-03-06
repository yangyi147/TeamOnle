package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Questions_comment;
import com.bean.Questions_tag;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.Questions_tagService;

@Controller
@RequestMapping("/admin/questions_tag")
public class Questions_tagController {
	
	@Autowired
	private Questions_tagService Questions_tagService;

	@RequestMapping("/listAll")
	public ModelAndView listAll(@RequestParam(required=true,defaultValue="1") Integer page,HttpServletRequest request) {
		PageHelper.startPage(page, 5);
		ModelAndView mv=new ModelAndView();
		List<Questions_tag> tags = Questions_tagService.listAll();
		PageInfo<Questions_tag>  pageInfo = new PageInfo<Questions_tag>(tags);
		mv.setViewName("/admin/question/tagList");
		mv.addObject("page", pageInfo);
		mv.addObject("tags", tags);
		return mv;
	}
	
	@RequestMapping("/updateStatus/{id}")
	public String updateStatus(@PathVariable("id")int id) {
	    Questions_tagService.updateStatus(id);
		return "redirect:/admin/questions_tag/listAll";
	}
	
	@RequestMapping("/init/{id}")
	public String init(@PathVariable("id")int id,Model model) {
		Questions_tag tag = Questions_tagService.getById(id);
		model.addAttribute("tag", tag);
		return "/admin/question/updateTag";
	}
	
	@RequestMapping("/update")
	public String update(Questions_tag tag){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date create_time = null;
		try {
			create_time = df.parse(df.format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		tag.setCreate_time(create_time);
		Questions_tagService.update(tag);
		return "redirect:/admin/questions_tag/listAll";
	}
	
	@RequestMapping("/save")
	public String save(Questions_tag tag){
		if (!tag.getQuestions_tag_name().equals("")) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date create_time = null;
			try {
				create_time = df.parse(df.format(new Date()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			tag.setCreate_time(create_time);
			Questions_tagService.save(tag);
		}
		return "redirect:/admin/questions_tag/listAll";
	}
}
