package com.example.service;

import com.example.entity.Admin;
import com.example.entity.AdminExample;

import java.util.List;
public interface AdminService {

    List<Admin> findAll();

    boolean validateAdmin(String username,String password);

    Admin getOneAdmin(String username);

//    boolean updateByUsername(String password,String address,String telephone,String classification,String part,String username);

    boolean updateByUsername(Admin admin,AdminExample example);


}
