package com.qa.dota_hobby_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DotaHobbyProjectApplication {

	public static void main(String[] args) {
		ApplicationContext beanBag  = SpringApplication.run(DotaHobbyProjectApplication.class, args);
		
		System.out.println("The current time is : " + beanBag.getBean("getTime", String.class) );
		
	}

}
