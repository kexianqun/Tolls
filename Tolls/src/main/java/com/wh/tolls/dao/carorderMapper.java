package com.wh.tolls.dao;

import com.wh.tolls.entity.carorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface carorderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(carorder record);

    int insertSelective(carorder record);

    carorder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(carorder record);

    int updateByPrimaryKey(carorder record);
    
    List<carorder> selectAll();

    int selectCount(int user_id);

    List<carorder> selectByUser(@Param("user_id") int userId,@Param("from") int from,@Param("to") int to);

}