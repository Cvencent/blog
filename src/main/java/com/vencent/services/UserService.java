package com.vencent.services;

import com.vencent.pojo.SysUser;

import org.springframework.security.core.userdetails.UserDetailsService;

/*
用户接口类
 */
public interface UserService extends UserDetailsService {

    /*
    用户注册
     */
    public boolean AddUser(SysUser sysUser);

    public SysUser SelectByUsername(String username);

    SysUser selectById(int id);
}
