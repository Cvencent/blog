package com.vencent.services;

import com.vencent.pojo.Leacots;

import java.util.List;

public interface LeacotsService {

    List<Leacots> selectByUser(int id);
}
