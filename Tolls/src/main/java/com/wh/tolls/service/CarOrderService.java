package com.wh.tolls.service;

import java.util.List;

import com.wh.tolls.entity.carorder;

public interface CarOrderService {
	int deleteByPrimaryKey(Integer userId);

    int insert(carorder record);

    int insertSelective(carorder record);

    carorder selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(carorder record);

    int updateByPrimaryKey(carorder record);

    List<carorder> selectAll();
}
