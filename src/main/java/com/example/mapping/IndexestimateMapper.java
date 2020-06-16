package com.example.mapping;

import com.example.entity.Indexestimate;
import com.example.entity.IndexestimateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexestimateMapper {
    long countByExample(IndexestimateExample example);

    int deleteByExample(IndexestimateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Indexestimate record);

    int insertSelective(Indexestimate record);

    List<Indexestimate> selectByExample(IndexestimateExample example);

    Indexestimate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Indexestimate record, @Param("example") IndexestimateExample example);

    int updateByExample(@Param("record") Indexestimate record, @Param("example") IndexestimateExample example);

    int updateByPrimaryKeySelective(Indexestimate record);

    int updateByPrimaryKey(Indexestimate record);
}