package com.example.mapping;

import com.example.entity.Selectcourse;
import com.example.entity.SelectcourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectcourseMapper {
    long countByExample(SelectcourseExample example);

    int deleteByExample(SelectcourseExample example);

    int deleteByPrimaryKey(Integer selectid);

    int insert(Selectcourse record);

    int insertSelective(Selectcourse record);

    int insertSelectiveByExample(@Param("record") Selectcourse record, @Param("example") SelectcourseExample example);

    List<Selectcourse> selectByExample(SelectcourseExample example);

    Selectcourse selectByPrimaryKey(Integer selectid);

    int updateByExampleSelective(@Param("record") Selectcourse record, @Param("example") SelectcourseExample example);

    int updateByExample(@Param("record") Selectcourse record, @Param("example") SelectcourseExample example);

    int updateByPrimaryKeySelective(Selectcourse record);

    int updateByPrimaryKey(Selectcourse record);
}