package com.datariver.powercontroller.dao;


import java.util.List;

import com.datariver.powercontroller.model.SysDept;


public interface SysDeptMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);
    
    List<SysDept> findPage();
    
    List<SysDept> findAll();
}