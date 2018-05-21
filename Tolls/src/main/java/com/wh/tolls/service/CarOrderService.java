package com.wh.tolls.service;

import com.wh.tolls.entity.carorder;

import java.util.List;

public interface CarOrderService {
	int deleteByPrimaryKey(Integer userId);

    int insert(carorder record);

    int insertSelective(carorder record);

    carorder selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(carorder record);

    int updateByPrimaryKey(carorder record);

    List<carorder> selectAll();

    int selectCount(int userid);

    List<carorder> selectByUser(int userId,int from , int to);
}
