package com.example.controller;

import com.example.entity.Indexestimate;
import com.example.service.IndexEstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexEstimateController {

    @Autowired
    private IndexEstimateService indexEstimateService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/allindexestimate")
    @ResponseBody
    public List<Indexestimate> getAllIndexEstimate() {
        return indexEstimateService.getAllIndexEstimate();
    }
}
