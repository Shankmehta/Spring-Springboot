package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
public class CustomerOperationsController 
{
  @GetMapping("/report")
  public Customer showData()
  {
	  Customer cust = new Customer(1001,"raja","hyd",44545.77f);
	  return cust;
  }
}
