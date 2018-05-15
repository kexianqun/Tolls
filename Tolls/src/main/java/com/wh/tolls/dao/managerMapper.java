package com.wh.tolls.dao;

import java.util.List;

import com.wh.tolls.entity.manager;

public interface managerMapper {
    int deleteByPrimaryKey(Integer managerId);

    int insert(manager record);

    int insertSelective(manager record);

    manager selectByPrimaryKey(Integer managerId);

    int updateByPrimaryKeySelective(manager record);

    int updateByPrimaryKey(manager record);
    
    List<manager> selectAll();
}