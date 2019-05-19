package com.example.demo.service;

import com.example.demo.vo.ResultVO;

import java.util.List;
import java.util.Map;

/**
 * @author xxy
 * @date 2019/5/10
 * @description
 */
public interface CalculateService {
    ResultVO getResult(List<String> inputList);
}
