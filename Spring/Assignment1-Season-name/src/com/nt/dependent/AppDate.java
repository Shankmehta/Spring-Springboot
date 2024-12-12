package com.nt.dependent;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.target")
public class AppDate
{
	@Bean(name="dt")
	public LocalDate createDt() {
		return LocalDate.now();
	}
	
	
}
