package com.nt.target;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder 
{
   
	@Autowired
	private LocalDate localdate;
	
	public String showSeasonFinder()
	{
		Month month=localdate.getMonth();
		String season;
		switch(month)
		{
		case DECEMBER:
		case JANUARY:
		case FEBRUARY:
			season="Winter";
			break;
		  case MARCH:
          case APRIL:
          case MAY:
              season = "Spring";
              break;
          case JUNE:
          case JULY:
          case AUGUST:
              season = "Summer";
              break;
          case SEPTEMBER:
          case OCTOBER:
          case NOVEMBER:
              season = "Autumn";
              break;
          default:
              season = "Unknown";
      }

      return season;
		
	}
}
