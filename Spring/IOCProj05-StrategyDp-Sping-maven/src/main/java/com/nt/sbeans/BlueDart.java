package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public final class BlueDart implements ICourier
{
    public BlueDart() {
	System.out.println("BlueDart===0 param constructor");
	}
    @Override
    public String deliver(int oid)
    {
    	return oid+"order items are kept for delivery by Bluedart";
    }
}
