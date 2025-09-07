package com.example.boot303_ssm.mapper;

import com.example.boot303_ssm.POJO.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface carMapper {
    public Car GetcarById(@Param("id") Long id);
}
