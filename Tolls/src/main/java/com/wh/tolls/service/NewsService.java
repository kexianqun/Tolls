package com.wh.tolls.service;

import java.util.List;

import com.wh.tolls.entity.news;

public interface NewsService {
	int deleteByPrimaryKey(Integer userId);

    int insert(news record);

    int insertSelective(news record);

    news selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(news record);

    int updateByPrimaryKey(news record);

    List<news> selectAll();
}
