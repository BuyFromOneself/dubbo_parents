package com.example.stu_service;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dao")
@DubboComponentScan("com.example.service")
public class StuServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuServiceApplication.class, args);
	}

}
