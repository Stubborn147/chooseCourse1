package com.example.service.impl;

import com.example.entity.Admin;
import com.example.entity.AdminExample;
import com.example.mapping.AdminMapper;
import com.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> findAll() {
        AdminExample example=new AdminExample();
        List<Admin> list=adminMapper.selectByExample(example);
        return list;
    }

    @Override
    public boolean validate(String username, String password) {
        AdminExample adminExample=new AdminExample();
        adminExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<Admin> admins=adminMapper.selectByExample(adminExample);
        System.out.println(admins.size());
        return admins.size()>0?true:false;
    }
}
