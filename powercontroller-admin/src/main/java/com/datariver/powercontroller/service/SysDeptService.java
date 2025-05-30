package com.datariver.powercontroller.service;


import java.util.List;

import com.datariver.powercontroller.model.SysDept;
import com.datariver.service.CurdService;


/**
 * 机构管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @param userId 
	 * @return
	 */
	List<SysDept> findTree();
}
