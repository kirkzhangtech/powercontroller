package com.datariver.powercontroller.service;



import java.util.List;

import com.datariver.powercontroller.model.SysUser;





public interface SysUserService {

    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();

}