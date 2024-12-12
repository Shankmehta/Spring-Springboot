package com.nt.dependent;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.target")
public class AppWeek 
{
  @Bean(name="aw")
  public LocalDate createweek()
  {
	 return LocalDate.now();
  }
}
