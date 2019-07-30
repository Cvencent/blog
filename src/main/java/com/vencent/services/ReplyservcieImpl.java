package com.vencent.services;

import com.vencent.dao.ReplyMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyservcieImpl implements ReplyService{


    @Autowired
    ReplyMapper replyMapper;


}
