package com.example.service;

import com.example.entity.Admin;

import java.util.List;
public interface AdminService {

    List<Admin> findAll();

    boolean validate(String username,String password);
}
