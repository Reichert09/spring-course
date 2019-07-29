package com.examplecourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages={
		"com.springcourse.services", "com.springcourse.resource", "com.springcourse.repository"})
@ComponentScan(basePackages = {"com.springcourse"})
@EntityScan(basePackages = {"com.springcourse.domain"})
@EnableJpaRepositories("com.springcourse.repository")
public class SpringCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCourseApplication.class, args);
	}

}
