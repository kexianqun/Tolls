package com.wh.tolls.dao;

import com.wh.tolls.entity.tolls;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface tollsMapper {
    int deleteByPrimaryKey(Integer tollsId);

    int insert(tolls record);

    int insertSelective(tolls record);

    tolls selectByPrimaryKey(Integer tollsId);

    int updateByPrimaryKeySelective(tolls record);

    int updateByPrimaryKey(tolls record);
    
    List<tolls> selectAll();
}