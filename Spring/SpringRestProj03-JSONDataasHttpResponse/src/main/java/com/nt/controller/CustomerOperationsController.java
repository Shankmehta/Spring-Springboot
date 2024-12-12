package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Company;
import com.nt.model.Customer;

@RestController
public class CustomerOperationsController {
    @GetMapping("/report")
    public ResponseEntity<Customer> showData()
    {
    	Customer cust= new Customer(1001,"raja",54566.66f,
    			                       new String[]{"red","green","blue"},
    			                       List.of("10th","10th+2","B.tech"),
    			                       Set.of(544535345L,757657545L,645644664L),
    			                       Map.of("aadhar",34565434L,"panNo",354353443L),
    			                       new Company("SAMSUNG","hyd","Eletronics",4000));
          HttpStatus status=HttpStatus.OK;
          return new ResponseEntity<Customer>(cust,status);
    	}
    }

