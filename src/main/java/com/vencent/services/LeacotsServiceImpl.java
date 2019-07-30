package com.vencent.services;

import com.vencent.dao.LeacotsMapper;
import com.vencent.dao.SysUserMapper;
import com.vencent.pojo.Leacots;
import com.vencent.pojo.LeacotsExample;
import com.vencent.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeacotsServiceImpl implements LeacotsService {

    @Autowired
    LeacotsMapper leacotsMapper;
    @Autowired
    SysUserMapper sysUserMapper;


    /*
    根据用户id查询微语
     */
    @Override
    public List<Leacots> selectByUser(int id){

        LeacotsExample leacotsExample = new LeacotsExample();
        LeacotsExample.Criteria criteria = leacotsExample.createCriteria();
        UserService userService = new UserServiceImpl();
        criteria.andUserIdEqualTo(id);
        List<Leacots> list = leacotsMapper.selectByExampleWithBLOBs(leacotsExample);
            if(!list.isEmpty()) {
            for (Leacots leacots : list) {
                SysUser sysUser = userService.selectById(leacots.getUserId());
                if (sysUser!=null) {
                    leacots.setUsernick(sysUser.getNickname());
                }
            }
        }
        return list;
    }
}
