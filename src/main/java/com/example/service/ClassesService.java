package com.example.service;

import com.example.entity.Classes;

import java.util.List;

public interface ClassesService {

    List<Classes> getAllClasses();

    boolean insertClasses(Classes classes);

}
