package com.wh.tolls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.tolls.dao.newsMapper;
import com.wh.tolls.entity.news;
import com.wh.tolls.service.NewsService;
@Service
public class NewsServiceImpl implements NewsService{

	@Autowired
	private newsMapper newsMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer newsId) {
		// TODO Auto-generated method stub
		return newsMapper.deleteByPrimaryKey(newsId);
	}

	@Override
	public int insert(news record) {
		// TODO Auto-generated method stub
		return newsMapper.insert(record);
	}

	@Override
	public int insertSelective(news record) {
		// TODO Auto-generated method stub
		return newsMapper.insertSelective(record);
	}

	@Override
	public news selectByPrimaryKey(Integer newsId) {
		// TODO Auto-generated method stub
		return newsMapper.selectByPrimaryKey(newsId);
	}

	@Override
	public int updateByPrimaryKeySelective(news record) {
		// TODO Auto-generated method stub
		return newsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(news record) {
		// TODO Auto-generated method stub
		return newsMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<news> selectAll() {
		// TODO Auto-generated method stub
		return newsMapper.selectAll();
	}
}
