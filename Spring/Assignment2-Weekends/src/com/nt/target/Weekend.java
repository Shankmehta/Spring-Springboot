package com.nt.target;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("we")
public class Weekend 
{
	@Autowired
    private LocalDate localdate;
    
    public String showweekend(String user)
    {
    	DayOfWeek dayofweek = localdate.getDayOfWeek();
    	String msg;
    		switch(dayofweek)
    		{
    		  case MONDAY:
    		  case TUESDAY:
    		  case WEDNESDAY:
    		  case THURSDAY:
    		  case FRIDAY:
    			  msg =" Enjoy ur WeekDays:"+user;
    			  break;
    		  case SATURDAY:
    		  case SUNDAY:
    			  msg = "Enjoy ur Weekends:"+user;
    			  break;
    		  default:
                  msg="Error: Invalid day of the week!";	  
    		}
    	return msg;
    }
}
