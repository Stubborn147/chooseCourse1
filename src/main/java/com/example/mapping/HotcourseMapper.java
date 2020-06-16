package com.example.mapping;

import com.example.entity.Hotcourse;
import com.example.entity.HotcourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotcourseMapper {
    long countByExample(HotcourseExample example);

    int deleteByExample(HotcourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hotcourse record);

    int insertSelective(Hotcourse record);

    List<Hotcourse> selectByExample(HotcourseExample example);

    Hotcourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hotcourse record, @Param("example") HotcourseExample example);

    int updateByExample(@Param("record") Hotcourse record, @Param("example") HotcourseExample example);

    int updateByPrimaryKeySelective(Hotcourse record);

    int updateByPrimaryKey(Hotcourse record);
}