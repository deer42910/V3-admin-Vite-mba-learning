package com.mba.learning;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mba.learning")
public class MbaLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbaLearningApplication.class, args);
	}

}
