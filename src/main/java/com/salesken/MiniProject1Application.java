package com.salesken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesken.service.StudentService;
import com.salesken.service.StudentServiceImpl;

@SpringBootApplication
public class MiniProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(MiniProject1Application.class, args);
	}

	@Bean
	public StudentService getService() {
		return new StudentServiceImpl();
	}
}
