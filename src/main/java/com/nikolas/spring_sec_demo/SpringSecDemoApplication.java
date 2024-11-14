package com.nikolas.spring_sec_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class SpringSecDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecDemoApplication.class, args);
	}

}
