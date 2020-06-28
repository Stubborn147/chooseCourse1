package com.example.service;

import com.example.entity.Estimate;
import com.example.entity.EstimateExample;

import java.util.List;

public interface EstimateService {
    List<Estimate>  getAllEstimate();
    List<Estimate> getEstimateBycid(EstimateExample estimateExample);
    boolean addEstimate(String cid,String content,String sid,String sname,String estimateTime);
}
