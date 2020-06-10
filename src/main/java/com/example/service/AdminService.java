package com.example.service;

import com.example.entity.Admin;
import com.example.entity.AdminExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface AdminService {

    List<Admin> findAll(AdminExample example);
}
