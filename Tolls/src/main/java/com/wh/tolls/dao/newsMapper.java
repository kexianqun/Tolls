package com.wh.tolls.dao;

import java.util.List;

import com.wh.tolls.entity.news;

public interface newsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int insert(news record);

    int insertSelective(news record);

    news selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(news record);

    int updateByPrimaryKey(news record);
    
    List<news> selectAll();
}