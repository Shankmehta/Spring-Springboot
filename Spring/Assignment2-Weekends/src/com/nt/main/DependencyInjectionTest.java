package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.dependent.AppWeek;
import com.nt.target.Weekend;

public class DependencyInjectionTest
{

	public static void main(String[] args) 
	{
	  AnnotationConfigApplicationContext ctx=
		    new	 AnnotationConfigApplicationContext(AppWeek.class);
	  
	  
	  Weekend end=ctx.getBean("we",Weekend.class);
	  
	  
	  String Msg=end.showweekend("Shashank");
	  System.out.println(Msg);
        
	}

}
