package com.mapper;

import java.util.List;

import com.bean.Comment;
import com.github.pagehelper.PageInfo;

public interface CommentDao {
	public  List<Comment> getListAll();
}
