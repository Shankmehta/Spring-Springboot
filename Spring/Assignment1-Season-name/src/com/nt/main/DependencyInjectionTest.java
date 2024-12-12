package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.dependent.AppDate;
import com.nt.target.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppDate.class);
		
		SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
      
		
		String msg=finder.showSeasonFinder();
		System.out.println(msg);
	}

}
