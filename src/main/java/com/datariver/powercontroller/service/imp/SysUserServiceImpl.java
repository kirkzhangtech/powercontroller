package com.datariver.powercontroller.service.imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datariver.powercontroller.dao.SysUserMapper;
import com.datariver.powercontroller.model.SysUser;
import com.datariver.powercontroller.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
    
    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}