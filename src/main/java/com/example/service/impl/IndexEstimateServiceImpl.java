package com.example.service.impl;

import com.example.entity.Indexestimate;
import com.example.entity.IndexestimateExample;
import com.example.mapping.IndexestimateMapper;
import com.example.service.IndexEstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndexEstimateServiceImpl implements IndexEstimateService {

    @Autowired
    private IndexestimateMapper indexestimateMapper;
    @Override
    public List<Indexestimate> getAllIndexEstimate() {
        IndexestimateExample example=new IndexestimateExample();
        return indexestimateMapper.selectByExample(example);
    }
}
