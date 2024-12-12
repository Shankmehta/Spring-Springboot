package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements ICourier
{
    public DTDC() 
    {
		System.out.println("DTDC ==0 param constructor");
	}
    @Override
    public String deliver(int oid)
    {
    	return oid+"order items are kept for delivery by DTDC";
    }
}
