package com.example.controller;

import com.example.entity.Estimate;
import com.example.entity.EstimateExample;
import com.example.service.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/estimate")
public class EstimateController {
    @Autowired
    EstimateService estimateService;


    @RequestMapping("/allEstimate")
    @ResponseBody
    public List<Estimate> getAllEstimate(){
        return estimateService.getAllEstimate();
    }

    @RequestMapping("/getEstimateBycid")
    @ResponseBody
    public List<Estimate> getEstimateBycid(String cid){
        List<Estimate> estimateList=null;
        EstimateExample ee=new EstimateExample();
        ee.createCriteria().andCidEqualTo(cid);
        estimateList=estimateService.getEstimateBycid(ee);
        return  estimateList;
    }

    @RequestMapping("/addEstimate")
    @ResponseBody
    public String addEstimate(String cid,String content,String sid,String sname,String estimateTime){
        boolean res= estimateService.addEstimate(cid,content,sid,sname,estimateTime);
        if(res){
            return "评论成功";
        }else {
            return "评论失败";
        }
    }
}
