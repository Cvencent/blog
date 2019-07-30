package com.vencent.dao;

import com.vencent.pojo.Leacots;
import com.vencent.pojo.LeacotsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeacotsMapper {
    long countByExample(LeacotsExample example);

    int deleteByExample(LeacotsExample example);

    int deleteByPrimaryKey(Integer leacotsId);

    int insert(Leacots record);

    int insertSelective(Leacots record);

    List<Leacots> selectByExampleWithBLOBs(LeacotsExample example);

    List<Leacots> selectByExample(LeacotsExample example);

    Leacots selectByPrimaryKey(Integer leacotsId);

    int updateByExampleSelective(@Param("record") Leacots record, @Param("example") LeacotsExample example);

    int updateByExampleWithBLOBs(@Param("record") Leacots record, @Param("example") LeacotsExample example);

    int updateByExample(@Param("record") Leacots record, @Param("example") LeacotsExample example);

    int updateByPrimaryKeySelective(Leacots record);

    int updateByPrimaryKeyWithBLOBs(Leacots record);

    int updateByPrimaryKey(Leacots record);
}