package com.wh.tolls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.tolls.dao.tollsMapper;
import com.wh.tolls.entity.tolls;
import com.wh.tolls.service.TollsService;
@Service
public class TollsServiceImpl implements TollsService{

	@Autowired
	private tollsMapper tollsMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer tollsId) {
		// TODO Auto-generated method stub
		return tollsMapper.deleteByPrimaryKey(tollsId);
	}

	@Override
	public int insert(tolls record) {
		// TODO Auto-generated method stub
		return tollsMapper.insert(record);
	}

	@Override
	public int insertSelective(tolls record) {
		// TODO Auto-generated method stub
		return tollsMapper.insertSelective(record);
	}

	@Override
	public tolls selectByPrimaryKey(Integer tollsId) {
		// TODO Auto-generated method stub
		return tollsMapper.selectByPrimaryKey(tollsId);
	}

	@Override
	public int updateByPrimaryKeySelective(tolls record) {
		// TODO Auto-generated method stub
		return tollsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(tolls record) {
		// TODO Auto-generated method stub
		return tollsMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<tolls> selectAll() {
		// TODO Auto-generated method stub
		return tollsMapper.selectAll();
	}
}
