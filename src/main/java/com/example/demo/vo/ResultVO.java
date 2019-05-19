package com.example.demo.vo;

import com.example.demo.service.model.DigitdataModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author xxy
 * @date 2019/5/10
 * @description
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResultVO {
    private Double score;
    private Integer count;
    private List<DigitdataModel> errorrecords;
}
