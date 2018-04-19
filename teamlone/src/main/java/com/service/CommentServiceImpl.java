package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Comment;
import com.bean.Images;
import com.github.pagehelper.PageInfo;
import com.mapper.CommentDao;

@Service
class CommentServiceImpl implements  CommentService {
	
	@Autowired 
	private  CommentDao commentDao;
	@Override
	public PageInfo<Comment> getListAll(Map map, int page) {
		List<Comment> ct=commentDao.getListAll();
		 PageInfo<Comment> info= new PageInfo<>(ct, page);
		return null;
	}

}
