package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")

public  final class DTDC implements ICourier
{
   public DTDC() {
	System.out.println("DTDC:::0-param-COnstructor");
    }
   @Override
   public String deliver(int oid)
   {
	   return "DTDC Courier is ready to deliver"+oid+"order number products";
   }
}
