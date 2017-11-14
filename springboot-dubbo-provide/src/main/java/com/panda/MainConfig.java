package com.panda;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// MyBatis 支持
@MapperScan("com.panda.mapper")
@SpringBootApplication
public class MainConfig {

	public static void main(String[] args) {

		SpringApplication.run(MainConfig.class, args);
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
