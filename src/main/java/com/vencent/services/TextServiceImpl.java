package com.vencent.services;

import com.vencent.dao.TextMapper;
import com.vencent.pojo.Text;
import com.vencent.pojo.TextExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TextServiceImpl implements TextService {

    @Autowired
    private TextMapper textMapper;


/*
查询文章数量
 */
    @Override
    public long selectNum() {
        TextExample textExample = new TextExample();
        long num = textMapper.countByExample(textExample);

        return num;
    }
/*
查询所有文章
 */
    @Override
    public List<Text> selectAll() {
        TextExample textExample = new TextExample();
        List<Text>  list = textMapper.selectByExample(textExample);

        return list;

    }
/*
根据文章类型查询文章
 */
    @Override
    public List<Text> selectByType(String s ,int id) {
        TextExample textExample = new TextExample();
        TextExample.Criteria criteria = textExample.createCriteria();
        criteria.andTextTypeEqualTo(s);
        criteria.andUserIdEqualTo(id);
        List<Text> list =  textMapper.selectByExampleWithBLOBs(textExample);

        return list;

    }
}
