package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages ="com.nt.sbeans")
public class AppConfig
{
	public AppConfig() {
		System.out.println("AppConfig:: 0 param constructor");
	}
	
   @Bean(name="dt1")
   @Scope("singleton")
   public LocalDateTime createLDT()
   {
	   System.out.println("AppConfig.createLDT1()");
	   return LocalDateTime.now();
   }
   @Bean(name="dt2")
   @Scope("singleton")
   public LocalDateTime createLDT2()
   {
	   System.out.println("AppConfig.createLDT2()");
	   return LocalDateTime.now();
   }
}
