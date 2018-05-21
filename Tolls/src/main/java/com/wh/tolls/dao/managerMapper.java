package com.wh.tolls.dao;

import com.wh.tolls.entity.manager;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface managerMapper {
    int deleteByPrimaryKey(Integer managerId);

    int insert(manager record);

    int insertSelective(manager record);

    manager selectByPrimaryKey(Integer managerId);

    manager selectByName(String mngName);

    int updateByPrimaryKeySelective(manager record);

    int updateByPrimaryKey(manager record);
    
    List<manager> selectAll();
}