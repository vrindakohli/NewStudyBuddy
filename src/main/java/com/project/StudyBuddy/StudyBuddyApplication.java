package com.project.StudyBuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
@SpringBootApplication
public class StudyBuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyBuddyApplication.class, args);
	}

}
