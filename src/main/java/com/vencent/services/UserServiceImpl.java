package com.vencent.services;

import com.vencent.dao.SysUserMapper;
import com.vencent.pojo.SysUser;
import com.vencent.pojo.SysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private SysUserMapper sysUserMapper;


    /*
    用户注册
     */
    @Override
    public boolean AddUser(SysUser sysUser) {

       int result =  sysUserMapper.insert(sysUser);
        System.out.println("result :"+result);
       if (result == 1){
           return true;
       }
       return false;
    }
/*
根据用户名查询用户
 */
    @Override
    public SysUser SelectByUsername(String username) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<SysUser> list = sysUserMapper.selectByExample(sysUserExample);
        if (!list.isEmpty()){
            return list.get(0);
        }
        return null;
    }
/*
根据用户id查询用户
 */
    @Override
    public SysUser selectById(int id) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<SysUser> list = sysUserMapper.selectByExample(sysUserExample);

      if (!list.isEmpty()){
          SysUser sysUser =  list.get(0);
          return sysUser;
        }
        return null;
    }


    /*
    spring security 安全校验
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 先设置假的权限
        List<GrantedAuthority> authorities = new ArrayList<>();
        // 传入角色
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        SysUser sysUser = SelectByUsername(username);
        User user = new User(sysUser.getUsername(), "{noop}"+sysUser.getPassword(), authorities) ;
        return user;
    }



}
