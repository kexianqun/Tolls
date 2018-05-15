package com.wh.tolls.service;

import java.util.List;

import com.wh.tolls.entity.user;

public interface UserService {

    int deleteByPrimaryKey(Integer userId);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);

    List<user> selectAll();
    
    user selectByUsername(String username);
}
