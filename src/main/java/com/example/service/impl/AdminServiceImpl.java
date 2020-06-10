package com.example.service.impl;

import com.example.entity.Admin;
import com.example.entity.AdminExample;
import com.example.mapping.AdminMapper;
import com.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> findAll(AdminExample example) {
        return adminMapper.selectByExample(example);
    }
}
