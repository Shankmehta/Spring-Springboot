package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowHomeControllers 
{
   @GetMapping("/process")
   public String process(Map<String,Object> map)
   {
	   
//	   map.put("name","raja");
//	   map.put("age",30);
	   
//	   map.put("favColors",new String[] {"red","green","yellow"});
//	   map.put("nickNames", List.of("raja","raj","maharaj"));
//	   map.put("phoneNumbers",Set.of(999999L,888888L,777777L));
//	   map.put("idDetails",Map.of("aadharNO",7889999,"voterid",654665464));
	
	   
	  
	   		
	   return "show_data";
   }
   
}
