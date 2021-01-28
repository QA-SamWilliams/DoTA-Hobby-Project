package com.qa.dota_hobby_project.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public static String getTime() {
		return LocalTime.now().toString();
	}
}
