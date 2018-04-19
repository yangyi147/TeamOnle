package com.mapper;

import java.util.List;

import com.bean.Emailsend;

public interface EmailsendDao {
            Emailsend  getById(int id);
            List<Emailsend> getlistAll();
            void insave(Emailsend emailsend);
            List<Emailsend> getlist(Emailsend emailsend);
}
