package com.example.service.impl;
import com.example.entity.Carouse;
import com.example.entity.CarouseExample;
import com.example.mapping.CarouseMapper;
import com.example.service.CarouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarouseServiceImpl implements CarouseService {

    @Autowired
    private CarouseMapper carouseMapper;
    @Override
    public List<Carouse> getAllCarouse() {
        CarouseExample example=new CarouseExample();
        return carouseMapper.selectByExample(example);
    }
}
