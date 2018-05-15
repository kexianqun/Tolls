package com.wh.tolls.dao;

import java.util.List;

import com.wh.tolls.entity.tolls;
import com.wh.tolls.entity.user;

public interface tollsMapper {
    int deleteByPrimaryKey(Integer tollsId);

    int insert(tolls record);

    int insertSelective(tolls record);

    tolls selectByPrimaryKey(Integer tollsId);

    int updateByPrimaryKeySelective(tolls record);

    int updateByPrimaryKey(tolls record);
    
    List<tolls> selectAll();
}