package com.bridgelab.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the configuration file
		ClassPathXmlApplicationContext context
		= new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");

		//retrive bean from spring container

		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
	     
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print out the result
		
		System.out.println("\n pointing to the same object"+result);
		
		System.out.println("\n memory location for coach"+theCoach);
		
		System.out.println("\n Memory location for alphacoach"+alphaCoach+"\n");
		
		
	
	}

}
