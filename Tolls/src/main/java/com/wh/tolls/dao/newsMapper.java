package com.wh.tolls.dao;

import com.wh.tolls.entity.news;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface newsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int insert(news record);

    int insertSelective(news record);

    news selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(news record);

    int updateByPrimaryKey(news record);
    
    List<news> selectAll();
}