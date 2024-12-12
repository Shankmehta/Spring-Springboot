package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class BootProj02DependencyInjectionApplication {

	public static void main(String[] args)
	{
		ApplicationContext ctx=SpringApplication.run(BootProj02DependencyInjectionApplication.class, args);
		
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		
		vehicle.journey("Hyd", "Ujjain");
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
