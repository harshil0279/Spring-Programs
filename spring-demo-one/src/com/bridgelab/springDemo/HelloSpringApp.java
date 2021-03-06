package com.bridgelab.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp
{

	public static void main(String[] args) 
	{
		//load the spring configuration file
		ClassPathXmlApplicationContext context
		        = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive the bean from spring container
		
		Coach thecoach = context.getBean("myCoach", Coach.class);
		
		//call methods on bean
		
		System.out.println(thecoach.getDailyWorkout());
		
		//lets call our new method for fortune
		System.out.println(thecoach.getDailyFortune());
		//close the context
		
		context.close();

	}

}
