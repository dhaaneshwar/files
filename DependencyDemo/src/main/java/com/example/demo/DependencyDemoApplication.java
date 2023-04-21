package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyDemoApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(DependencyDemoApplication.class, args);     // configurableapplicationcontext --> to get the objects of the class 
		Customers c=context.getBean(Customers.class);         //return the object of the class
		c.display();
	}

}
