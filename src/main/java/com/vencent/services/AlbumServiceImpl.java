package com.vencent.services;

import com.vencent.dao.AlbumMapper;
import com.vencent.pojo.Album;
import com.vencent.pojo.AlbumExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    AlbumMapper albumMapper;
    /*
    根据用户id查询相册
     */
    @Override
    public List<Album> albums(int id) {
        AlbumExample albumExample = new AlbumExample();
        AlbumExample.Criteria criteria =  albumExample.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<Album> list = albumMapper.selectByExample(albumExample);
        return list;
    }
}
