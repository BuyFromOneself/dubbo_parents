package com.example.stu_controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages = "com.example")
public class StuControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuControllerApplication.class, args);
	}

}
