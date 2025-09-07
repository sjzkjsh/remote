package com.example.boot303_ssm.MyController;

import com.example.boot303_ssm.POJO.Car;
import com.example.boot303_ssm.mapper.carMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    @Autowired
    carMapper carmapper;
    @GetMapping("/hello/{id}")
    public Car hello(@PathVariable("id") Long id){
        Car s = carmapper.GetcarById(id);
        return s;
    }


}
