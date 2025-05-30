package com.datariver.powercontroller.service.imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.datariver.page.MybatisPageHelper;
import com.datariver.page.PageRequest;
import com.datariver.page.PageResult;
import com.datariver.powercontroller.dao.SysLoginLogMapper;
import com.datariver.powercontroller.model.SysLoginLog;
import com.datariver.powercontroller.service.SysLoginLogService;



@Service
public class SysLoginLogServiceImpl  implements SysLoginLogService {

	@Autowired
	private SysLoginLogMapper sysLoginLogMapper;

	@Override
	public int save(SysLoginLog record) {
		if(record.getId() == null || record.getId() == 0) {
			return sysLoginLogMapper.insertSelective(record);
		}
		return sysLoginLogMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int delete(SysLoginLog record) {
		return sysLoginLogMapper.deleteByPrimaryKey(record.getId());
	}

	@Override
	public int delete(List<SysLoginLog> records) {
		for(SysLoginLog record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public SysLoginLog findById(Long id) {
		return sysLoginLogMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		Object userName = pageRequest.getParamValue("userName");
		Object status = pageRequest.getParamValue("status");
		if(userName != null && status != null) {
			return MybatisPageHelper.findPage(pageRequest, sysLoginLogMapper, "findPageByUserNameAndStatus", userName, status);
		} else if(status != null) {
			return MybatisPageHelper.findPage(pageRequest, sysLoginLogMapper, "findPageByStatus", status);
		} else if(userName != null) {
			return MybatisPageHelper.findPage(pageRequest, sysLoginLogMapper, "findPageByUserName", userName);
		}
		return MybatisPageHelper.findPage(pageRequest, sysLoginLogMapper);
	}
	
	@Transactional
	@Override
	public int writeLoginLog(String userName, String ip) {
		List<SysLoginLog> sysLoginLogs = sysLoginLogMapper.findByUserNameAndStatus(userName, SysLoginLog.STATUS_ONLINE);
		for(SysLoginLog sysLoginLog:sysLoginLogs) {
			sysLoginLog.setStatus(SysLoginLog.STATUS_LOGIN);
			sysLoginLogMapper.updateByPrimaryKey(sysLoginLog);
		}
		SysLoginLog record = new SysLoginLog();
		record.setUserName(userName);
		record.setIp(ip);
		record.setStatus(SysLoginLog.STATUS_LOGOUT);
		sysLoginLogMapper.insertSelective(record);
		record.setStatus(SysLoginLog.STATUS_ONLINE);
		sysLoginLogMapper.insertSelective(record);
		return 0;
	}
}
