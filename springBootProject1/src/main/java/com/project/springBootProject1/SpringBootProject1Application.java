package com.project.springBootProject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.Controller"})
public class SpringBootProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject1Application.class, args);
	}

}
