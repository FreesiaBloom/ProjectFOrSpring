package com.freesiaBloom.ProjectForSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjectForSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProjectForSpringApplication.class, args);

		Dev obj = context.getBean(Dev.class);

		obj.build();
	}

}
