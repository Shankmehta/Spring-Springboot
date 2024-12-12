package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Data;
@Controller

public class Employee 
{
	
	   @GetMapping("/process")
	   public String process(Map<String,Object> map)
	   {

		
		   
			/*
			 * Employee emp =new Employee(); emp.setEno(1001);emp.setEname("raja");
			 * emp.setSalary(90000.0);emp.setVaccinated(true); map.put("empInfo", emp);
			 */
		   		
		   return "show_report";
	   }

	
		
	}
	   
	

