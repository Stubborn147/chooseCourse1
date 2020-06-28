package com.example.service.impl;

import com.example.entity.Estimate;
import com.example.entity.EstimateExample;
import com.example.mapping.EstimateMapper;
import com.example.service.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstimateServiceImpl implements EstimateService {

    @Autowired
    EstimateMapper estimateMapper;

    @Override
    public List<Estimate> getAllEstimate() {
        return estimateMapper.selectByExample(new EstimateExample());
    }

    @Override
    public List<Estimate> getEstimateBycid(EstimateExample estimateExample) {
        return estimateMapper.selectByExample(estimateExample);
    }

    @Override
    public boolean addEstimate(String cid,String content,String sid,String sname,String estimateTime) {
        Estimate estimate=new Estimate();
        estimate.setCid(cid);
        estimate.setContent(content);
        estimate.setSid(sid);
        estimate.setsName(sname);
        estimate.setEstimateTime(estimateTime);
        int es=estimateMapper.insertSelective(estimate);
        return es>0?true:false;
    }
}
