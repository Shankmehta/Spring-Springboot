package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public  final class Flipkart 
{
	
	@Autowired
	
   private ICourier courier;
   
   public Flipkart( ICourier courier)
   {
	   this.courier=courier;
	   System.out.println("Flipkart::) param constructor");
   }
   
   public String shopping(String items[],double prices[])
   {
	   System.out.println("Flipkart.shopping()");
	   double billAmt=0.0;
	   for(double p:prices)
	   {
		   billAmt=billAmt+p;
	   }
	   int oid=new Random().nextInt(100000);
	   
	   String msg=courier.deliver(oid);
	   return Arrays.toString(items)+"are shopped having billAmount::"+billAmt+"--->"+msg;
   }
}
