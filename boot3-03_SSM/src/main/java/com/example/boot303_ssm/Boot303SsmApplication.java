package com.example.boot303_ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//告诉SpringBoot这个包下的所有接口都是Mapper接口
//还需要告诉springboot mapper的xml文件在哪个位置，在properties中配置
@MapperScan(basePackages = "com.example.boot303_ssm.mapper")
@SpringBootApplication
public class Boot303SsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot303SsmApplication.class, args);
	}

}
