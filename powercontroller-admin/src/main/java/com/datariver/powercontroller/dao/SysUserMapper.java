package com.datariver.powercontroller.dao;



import java.util.List;

import com.datariver.powercontroller.model.SysUser;


public interface SysUserMapper {
    
    
  /**
     * 查询全部
     * @return
     */
    List<SysUser> findAll();
}