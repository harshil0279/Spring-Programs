package com.bridgelab.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load the configuration file
		ClassPathXmlApplicationContext context
		= new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		//retrive bean from spring container

		Coach theCoach = context.getBean("myCoach",Coach.class);
	
	     System.out.println(theCoach.getDailyWorkout());
		
		//close the context
	     context.close();
	  
	}

}
