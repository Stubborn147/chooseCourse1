package com.example.mapping;

import com.example.entity.Carouse;
import com.example.entity.CarouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarouseMapper {
    long countByExample(CarouseExample example);

    int deleteByExample(CarouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Carouse record);

    int insertSelective(Carouse record);

    List<Carouse> selectByExample(CarouseExample example);

    Carouse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Carouse record, @Param("example") CarouseExample example);

    int updateByExample(@Param("record") Carouse record, @Param("example") CarouseExample example);

    int updateByPrimaryKeySelective(Carouse record);

    int updateByPrimaryKey(Carouse record);
}