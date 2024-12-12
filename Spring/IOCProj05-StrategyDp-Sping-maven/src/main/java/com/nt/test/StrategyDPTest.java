package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args)
	{
	  AnnotationConfigApplicationContext ctx=
			  new  AnnotationConfigApplicationContext(AppConfig.class);
	  
	  Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
	  
	  String result=fpkt.shopping(new String[] {"shirt","trouser"},new double[] {60000.0,7000.0});
	  System.out.println(result);
  
	  ctx.close();
	}

}
