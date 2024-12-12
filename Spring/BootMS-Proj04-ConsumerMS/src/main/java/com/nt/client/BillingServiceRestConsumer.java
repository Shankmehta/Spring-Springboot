package com.nt.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer
{
   @Autowired
	private DiscoveryClient client;
    public String getBillingInfo()
    {
    	List<ServiceInstance> listSI=client.getInstances("Billing-Service");
    	if (listSI != null && !listSI.isEmpty()) {
    	    ServiceInstance SI = listSI.get(0);
    	    String url = SI.getUri() + "/billing/info";
    	    RestTemplate template = new RestTemplate();
    	    return template.getForObject(url, String.class);
    	} else {
    	    return "Billing Service is not available.";
    	}

    }
	
	
}
