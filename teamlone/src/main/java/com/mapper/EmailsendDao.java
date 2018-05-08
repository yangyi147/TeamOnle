package com.mapper;

import java.util.List;
import java.util.Map;

import com.bean.Emailsend;

public interface EmailsendDao {
    Emailsend  getById(int id);
    List<Emailsend> getlistAll(Map map);
    void insave(Emailsend emailsend);
    List<Emailsend> getlist(Emailsend emailsend);
}
