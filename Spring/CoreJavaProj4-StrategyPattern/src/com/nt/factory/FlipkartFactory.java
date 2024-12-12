package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkartFactory
{
   public static Flipkart getInstance(String courierType)
   {
	   Courier courier=null;
	   if(courierType.equalsIgnoreCase("dtdc"))
		   courier = new DTDC();
	   else if(courierType.equalsIgnoreCase("bluedart"))
		   courier = new BlueDart();
	   else
		   throw new IllegalArgumentException("invalid courier type");
	   
	   Flipkart fpkt = new Flipkart();
	   fpkt.setCourier(courier);
	   return fpkt;
   }
}
