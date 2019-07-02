package com.example.demo.service.impl;

import com.example.demo.data.dao.DigitdataRepository;
import com.example.demo.data.dataobject.DigitdataDO;
import com.example.demo.service.CalculateService;
import com.example.demo.service.model.DigitdataModel;
import com.example.demo.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xxy
 * @date 2019/5/10
 * @description
 */

@Service
public class CalculateServiceImpl implements CalculateService{
    @Autowired
    DigitdataRepository digitdataRepository;
    @Override
    public ResultVO getResult(List<String> inputList,Integer kind) {
        ResultVO resultVO = new ResultVO();
        List<DigitdataModel> modelList = new ArrayList<>();
        Integer score = 0;
        Integer count = 0;
        List<DigitdataDO> dbList = digitdataRepository.findByKind(kind);
        for (int i = 0; i < inputList.size(); i++) {
            String value = dbList.get(i).getValue().trim();
            String input = inputList.get(i).trim();
            if (input.equals(value)) {
                score += 1;
            } else {
                if(!input.equals("null")){
                    count += 1;
                }
                DigitdataModel digitdataModel = new DigitdataModel(dbList.get(i), inputList.get(i),kind);
                modelList.add(digitdataModel);
            }
        }
        resultVO.setScore(score*0.25);
        resultVO.setCount(count);
        resultVO.setErrorrecords(modelList);
        return resultVO;
    }
}
