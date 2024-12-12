package com.nt.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingServiceRestConsumer;
@RestController
@RequestMapping("/shopping")
public class ShoppingServiceOperationController 
{
	@Autowired
  private BillingServiceRestConsumer client;
	
	@GetMapping("details")
	public ResponseEntity<String> showBillingDetails()
	{
		String resultBody=client.getBillingInfo();
		String billInfo="Bill amount::"+new Random().nextInt(100000);
		return new ResponseEntity<String>(billInfo+"...."+resultBody,HttpStatus.OK);
	}
}
