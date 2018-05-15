package com.wh.tolls.service;

import java.util.List;

import com.wh.tolls.entity.manager;

public interface ManagerService {
	int deleteByPrimaryKey(Integer userId);

    int insert(manager record);

    int insertSelective(manager record);

    manager selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(manager record);

    int updateByPrimaryKey(manager record);

    List<manager> selectAll();
}
