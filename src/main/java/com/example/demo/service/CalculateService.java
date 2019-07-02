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
    /**
     * 根据用户的输入结果以及所选试卷类型来计算用户分数
     * @param inputList
     * @param kind
     * @return
     */
    ResultVO getResult(List<String> inputList,Integer kind);
}
