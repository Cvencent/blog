package com.vencent.dao;

import com.vencent.pojo.Whisper;
import com.vencent.pojo.WhisperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WhisperMapper {
    long countByExample(WhisperExample example);

    int deleteByExample(WhisperExample example);

    int deleteByPrimaryKey(Integer whisperId);

    int insert(Whisper record);

    int insertSelective(Whisper record);

    List<Whisper> selectByExampleWithBLOBs(WhisperExample example);

    List<Whisper> selectByExample(WhisperExample example);

    Whisper selectByPrimaryKey(Integer whisperId);

    int updateByExampleSelective(@Param("record") Whisper record, @Param("example") WhisperExample example);

    int updateByExampleWithBLOBs(@Param("record") Whisper record, @Param("example") WhisperExample example);

    int updateByExample(@Param("record") Whisper record, @Param("example") WhisperExample example);

    int updateByPrimaryKeySelective(Whisper record);

    int updateByPrimaryKeyWithBLOBs(Whisper record);

    int updateByPrimaryKey(Whisper record);
}