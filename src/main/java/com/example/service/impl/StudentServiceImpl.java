package com.example.service.impl;

import com.example.entity.Student;
import com.example.entity.StudentExample;
import com.example.mapping.StudentMapper;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public boolean ValidateStudent(String username1, String password1) {
        StudentExample studentExample=new StudentExample();
        studentExample.createCriteria().andSidEqualTo(username1).andPwdEqualTo(password1);
        List<Student> nameAndPass=studentMapper.selectByExample(studentExample);
        return nameAndPass.size()>0?true:false;
    }

    @Override
    public boolean delOneStudent(String sid) {
        return studentMapper.deleteByPrimaryKey(sid)>0?true:false;
    }

    @Override
    public List<Student> getAllStudent() {
        StudentExample example=new StudentExample();
        return studentMapper.selectByExample(example);
    }

    @Override
    public Student getOneStudent(String sid) {
        return studentMapper.selectByPrimaryKey(sid);
    }

    @Override
    public void importStudent(List<Student> students) {
        for(Student stu:students){
            studentMapper.insert(stu);
        }
    }

    @Override
    public boolean updateStudent(Student student,StudentExample example) {
        return studentMapper.updateByExampleSelective(student,example)>0?true:false;
    }

    @Override
    public boolean updatePwd(String sid, String pwd) {
        StudentExample example=new StudentExample();
        example.createCriteria().andSidEqualTo(sid);
        Student student=new Student();
        student.setPwd(pwd);
        return studentMapper.updateByExampleSelective(student,example)>0?true:false;
    }

}
