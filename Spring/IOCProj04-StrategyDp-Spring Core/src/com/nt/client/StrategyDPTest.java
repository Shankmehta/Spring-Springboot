package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StrategyDPTest {
 
	  
  
	public static void main(String[] args)
	{
		try {
	   AnnotationConfigApplicationContext ctx=
			   new AnnotationConfigApplicationContext(AppConfig.class);

	   
	   Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
	   
	   String resultMsg=fpkt.shopping(new String[] {"shrit","trouser"},new double[] {90000.0,50000.0} );
	   System.out.println(resultMsg);
	   ctx.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	  
	}

}
                   