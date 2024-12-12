package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj04LayeredApplication {

	public static void main(String[] args)
	{
		
        ApplicationContext ctx =SpringApplication.run(BootProj04LayeredApplication.class, args);
        
        
        PayrollOperationsController controller = ctx.getBean("payRoll",PayrollOperationsController.class);
        
        
        try {
        	List<Employee> list = controller.showEmployeesByDesgs("CLERK","MANAGER","SALESMAN");
        	list.forEach(emp->{
        		System.out.println(emp);
        	});
        }catch(Exception e)
        {
        	e.printStackTrace();
        	System.err.println("Internal pblm -- try again::"+e.getMessage());
        }
        ((ConfigurableApplicationContext)ctx).close();
	}

}
