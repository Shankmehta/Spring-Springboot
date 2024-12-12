package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

@Component("cust")
@ConfigurationProperties(prefix="cust.info")
@Data
public class Customer {
    private Integer custno;
    private String custname;
    private String custaddrs;
    private Double billamt;
}

