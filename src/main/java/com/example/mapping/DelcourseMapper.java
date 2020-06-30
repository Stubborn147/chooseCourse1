package com.example.mapping;

import com.example.entity.Delcourse;
import com.example.entity.DelcourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DelcourseMapper {
    long countByExample(DelcourseExample example);

    int deleteByExample(DelcourseExample example);

    int deleteByPrimaryKey(Integer delid);

    int insert(Delcourse record);

    int insertSelective(Delcourse record);

    List<Delcourse> selectByExample(DelcourseExample example);

    Delcourse selectByPrimaryKey(Integer delid);

    int updateByExampleSelective(@Param("record") Delcourse record, @Param("example") DelcourseExample example);

    int updateByExample(@Param("record") Delcourse record, @Param("example") DelcourseExample example);

    int updateByPrimaryKeySelective(Delcourse record);

    int updateByPrimaryKey(Delcourse record);
}