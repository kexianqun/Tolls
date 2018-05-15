package com.wh.tolls.service;

import java.util.List;

import com.wh.tolls.entity.tolls;

public interface TollsService {
	int deleteByPrimaryKey(Integer userId);

    int insert(tolls record);

    int insertSelective(tolls record);

    tolls selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(tolls record);

    int updateByPrimaryKey(tolls record);

    List<tolls> selectAll();
}
