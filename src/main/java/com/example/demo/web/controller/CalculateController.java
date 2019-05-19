package com.example.demo.web.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.service.CalculateService;
import com.example.demo.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author xxy
 * @date 2019/5/10
 * @description
 */
@Controller
@CrossOrigin
public class CalculateController {
    @Autowired
    CalculateService calculateService;

    @ResponseBody
    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public ResultVO submit(String inputList){
        List<String> inputs = new ArrayList<>(Arrays.asList(inputList.split(",")));
        if(inputs.size()!=400){
            for(int i = inputs.size();i<400;i++){
                inputs.add("null");
            }
        }
        return calculateService.getResult(inputs);
    }

}
