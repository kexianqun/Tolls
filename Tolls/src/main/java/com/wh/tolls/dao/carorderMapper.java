package com.wh.tolls.dao;

import com.wh.tolls.entity.carorder;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface carorderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(carorder record);

    int insertSelective(carorder record);

    carorder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(carorder record);

    int updateByPrimaryKey(carorder record);
    
    List<carorder> selectAll();

    List<carorder> selectByUser(int userId);

}