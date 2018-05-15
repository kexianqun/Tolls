package com.wh.tolls.dao;

import java.util.List;

import com.wh.tolls.entity.carorder;

public interface carorderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(carorder record);

    int insertSelective(carorder record);

    carorder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(carorder record);

    int updateByPrimaryKey(carorder record);
    
    List<carorder> selectAll();
}