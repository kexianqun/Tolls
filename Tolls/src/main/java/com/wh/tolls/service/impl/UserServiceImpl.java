package com.wh.tolls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.tolls.dao.userMapper;
import com.wh.tolls.entity.user;
import com.wh.tolls.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private userMapper userMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public int insert(user record) {
		// TODO Auto-generated method stub
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(user record) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(record);
	}

	@Override
	public user selectByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int updateByPrimaryKeySelective(user record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(user record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<user> selectAll() {
		// TODO Auto-generated method stub
		return userMapper.selectAll();
	}

	@Override
	public user selectByUsername(String username) {
		// TODO Auto-generated method stub
		return userMapper.selectByUsername(username);
	}
    
}
