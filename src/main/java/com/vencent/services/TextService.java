package com.vencent.services;

import com.vencent.pojo.Text;

import java.util.List;

public interface TextService {
    public long selectNum();
    public List<Text> selectAll();

    List<Text> selectByType(String s, int id);
}
