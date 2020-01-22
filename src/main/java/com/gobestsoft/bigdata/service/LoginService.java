package com.gobestsoft.bigdata.service;

import com.gobestsoft.bigdata.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public int queryUserByUsernameAndPassword(String username, String password) {

        return this.sysUserMapper.selectCountByUsernameAndPassword( username,password );

    }
}
