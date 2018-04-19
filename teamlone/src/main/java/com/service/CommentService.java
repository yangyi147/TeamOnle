package com.service;

import java.util.Map;

import com.bean.Comment;
import com.github.pagehelper.PageInfo;

public interface CommentService {
  public PageInfo<Comment> getListAll(Map map,int page);
}
