package com.example.service;

import com.example.entity.Admin;

import java.util.List;
public interface AdminService {

    List<Admin> findAll();

    boolean validateAdmin(String username,String password);

}
