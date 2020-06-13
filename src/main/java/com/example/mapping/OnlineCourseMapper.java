package com.example.mapping;

import com.example.entity.OnlineCourse;
import com.example.entity.OnlineCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlineCourseMapper {
    long countByExample(OnlineCourseExample example);

    int deleteByExample(OnlineCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OnlineCourse record);

    int insertSelective(OnlineCourse record);

    List<OnlineCourse> selectByExample(OnlineCourseExample example);

    OnlineCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OnlineCourse record, @Param("example") OnlineCourseExample example);

    int updateByExample(@Param("record") OnlineCourse record, @Param("example") OnlineCourseExample example);

    int updateByPrimaryKeySelective(OnlineCourse record);

    int updateByPrimaryKey(OnlineCourse record);
}