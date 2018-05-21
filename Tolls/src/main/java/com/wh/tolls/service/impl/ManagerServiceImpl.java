package com.wh.tolls.service.impl;

import com.wh.tolls.dao.managerMapper;
import com.wh.tolls.entity.manager;
import com.wh.tolls.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagerServiceImpl implements ManagerService{

	@Autowired
	private managerMapper managerMapper;
	@Override
	public int deleteByPrimaryKey(Integer managerId) {
		// TODO Auto-generated method stub
		return managerMapper.deleteByPrimaryKey(managerId);
	}

	@Override
	public int insert(manager record) {
		// TODO Auto-generated method stub
		return managerMapper.insert(record);
	}

	@Override
	public int insertSelective(manager record) {
		// TODO Auto-generated method stub
		return managerMapper.insertSelective(record);
	}

	@Override
	public manager selectByPrimaryKey(Integer managerId) {
		// TODO Auto-generated method stub
		return managerMapper.selectByPrimaryKey(managerId);
	}

	@Override
	public manager selectByName(String mngName) {
		// TODO Auto-generated method stub
		return managerMapper.selectByName(mngName);
	}

	@Override
	public int updateByPrimaryKeySelective(manager record) {
		// TODO Auto-generated method stub
		return managerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(manager record) {
		// TODO Auto-generated method stub
		return managerMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<manager> selectAll() {
		// TODO Auto-generated method stub
		return managerMapper.selectAll();
	}
}
