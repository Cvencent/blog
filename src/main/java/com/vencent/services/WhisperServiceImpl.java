package com.vencent.services;

import com.vencent.dao.WhisperMapper;
import com.vencent.pojo.Whisper;
import com.vencent.pojo.WhisperExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class WhisperServiceImpl implements WhisperService  {

    @Autowired
    WhisperMapper whisperMapper;
    /*
    根据用户id查询微语
     */
    @Override
    public List<Whisper> findById(int id) {
        WhisperExample whisperExample = new WhisperExample();
        WhisperExample.Criteria criteria = whisperExample.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<Whisper> list = whisperMapper.selectByExampleWithBLOBs(whisperExample);

        for(Whisper whisper:list){
            System.out.println(whisper);

        }
        return list;
    }
}
