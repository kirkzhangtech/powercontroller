package com.datariver.powercontroller.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.datariver.powercontroller.model.SysLoginLog;


public interface SysLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    SysLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLoginLog record);

    int updateByPrimaryKey(SysLoginLog record);
    
    List<SysLoginLog> findPage();
    
    List<SysLoginLog> findPageByUserName(@Param(value="userName") String userName);
    
    List<SysLoginLog> findPageByStatus(@Param(value="status") String status);
    
    List<SysLoginLog> findPageByUserNameAndStatus(@Param(value="userName") String userName, @Param(value="status") String status);
    
    List<SysLoginLog> findByUserNameAndStatus(@Param(value="userName") String userName, @Param(value="status") String status);
}