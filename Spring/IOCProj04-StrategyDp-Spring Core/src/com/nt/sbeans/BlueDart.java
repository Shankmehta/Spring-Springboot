package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bDart")
@Primary
public final class BlueDart implements ICourier
{
   public BlueDart() {
	System.out.println("BlueDart::: 0-param COnstructor");
      }
   @Override
   public String deliver(int oid)
   {
	   return "BlueDart Courier is ready to deliver"+oid+"order number products";
   }
}
