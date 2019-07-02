package com.example.demo.data.dao;

import com.example.demo.data.dataobject.DigitdataDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xxy
 * @date 2019/5/10
 * @description
 */
public interface DigitdataRepository extends JpaRepository<DigitdataDO,Integer>{
    @Override
    List<DigitdataDO> findAll();

    List<DigitdataDO> findByKind(Integer kind);
}
