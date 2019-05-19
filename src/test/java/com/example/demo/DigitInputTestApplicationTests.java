package com.example.demo;

import com.example.demo.data.dao.DigitdataRepository;
import com.example.demo.data.dataobject.DigitdataDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DigitInputTestApplicationTests {
    @Autowired
    DigitdataRepository digitdataRepository;
	@Test
	public void contextLoads() {
        List<DigitdataDO> dbList = digitdataRepository.findAll();
        System.out.println(dbList);
	}

}
