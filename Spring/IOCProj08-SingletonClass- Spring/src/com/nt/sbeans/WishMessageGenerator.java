package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
public class WishMessageGenerator 
{
	@Autowired
	@Qualifier("dt1")
    private LocalDateTime dateTime; 
	
	public String showWishMessage(String user)
	{
		int hour=dateTime.getHour();
		if(hour<12)
			return "Good Morning:"+user;
		else if(hour<16)
			return "Good Afternoon:"+user;
		else if(hour<20)
			return "Good Evening:"+user;
		else 
			return "Good Night:"+user;
	}
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator :: 0-param constructor");
	}
}
