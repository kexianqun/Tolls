package com.wh.tolls.service;

import com.wh.tolls.entity.manager;

import java.util.List;

public interface ManagerService {
	int deleteByPrimaryKey(Integer userId);

    int insert(manager record);

    int insertSelective(manager record);

    manager selectByPrimaryKey(Integer userId);

    manager selectByName(String mngName);

    int updateByPrimaryKeySelective(manager record);

    int updateByPrimaryKey(manager record);

    List<manager> selectAll();
}
