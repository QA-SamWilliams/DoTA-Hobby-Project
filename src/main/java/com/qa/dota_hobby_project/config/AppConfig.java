package com.qa.dota_hobby_project.config;

import java.time.LocalTime;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class AppConfig {
	
	@Bean
	public static String getTime() {
		return LocalTime.now().toString();
	}
	
	@Bean
    public ModelMapper mapper() {
        return new ModelMapper();
    }

}
