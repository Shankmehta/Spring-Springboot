package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart 
{
     private Courier courier;
      
     public void setCourier(Courier courier)
     {
    	 System.out.println("Flipkart.setCourier()");
    	 this.courier=courier;
     }
     public String shoping(String items[],double prices[])
     {
    	 double billAmount=0.0;
    	 for(double p :prices)
    	 {
    		 billAmount=billAmount+p;
    	 }
    	 int oid=new Random().nextInt(1000);
    	 
    	 String msg=courier.deliver(oid);
    	 return Arrays.toString(items)+"items with billAmount:::"+billAmount+"---"+msg;
     }
     
}
