package com.wh.tolls.dao;

import com.wh.tolls.entity.user;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface userMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
    
    List<user> selectAll();
    
    user selectByUsername(String username);
}