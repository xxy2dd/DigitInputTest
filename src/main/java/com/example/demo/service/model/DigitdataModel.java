package com.example.demo.service.model;

import com.example.demo.data.dataobject.DigitdataDO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author xxy
 * @date 2019/5/10
 * @description
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DigitdataModel {
    /**
     * 数字序号
     */
    private int index;
    /**
     * 数据库中正确的值
     */
    private String dbvalue;
    /**
     * 用户输入的值
     */
    private String inputvalue;

    /**
     *
     * @param digitdataDO
     * @param inputvalue
     */
    public DigitdataModel(DigitdataDO digitdataDO, String inputvalue){
        this.index = digitdataDO.getIndex();
        this.dbvalue = digitdataDO.getValue();
        this.inputvalue = inputvalue;
    }

}
