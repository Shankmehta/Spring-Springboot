package com.nt.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController 
{
   @RequestMapping("/process")
   public String process(Map<String,Object> map)
   {
	   System.out.println("ShowHomeController.process()::Share Memory Object class name"+map.getClass());
	   map.put("attr1","val1");
	   map.put("sysDt",LocalDateTime.now());
	   
	   
	   return "show_data";
   }
   
}
