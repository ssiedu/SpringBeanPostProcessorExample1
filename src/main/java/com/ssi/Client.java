package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		System.out.println("Starting Application");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Customer c1=context.getBean("customer1",Customer.class);
		c1.showInfo();
		System.out.println("_______________________________________________________________");
		Customer c2=context.getBean("customer2",Customer.class);
		c2.showInfo();
		System.out.println("_______________________________________________________________");

		Product p1=context.getBean("product1",Product.class);
		p1.showInfo();
		
		/*
		System.out.println("_______________________________________________________________");
		Supplier s1=context.getBean("supplier1",Supplier.class);
		*/
	}
}

