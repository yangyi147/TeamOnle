package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Images;
import com.service.ImagesService;

@Controller
@RequestMapping("/front/Images")
public class ImagesController {
	@Autowired
	private ImagesService imagesService;
	@RequestMapping("/listAll")
	public ModelAndView list(){
		List<Images> websiteImagesList=imagesService.getListAll();
		ModelAndView md=new ModelAndView();
		md.addObject("websiteImagesList", websiteImagesList);
		md.setViewName("web/index/index");
		return md;
	}

}
