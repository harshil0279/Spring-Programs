package com.bridgelab.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelab.spring_auto.Application;

public class Main {
	public static void main(String args[]){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

		//autowire=byName 
		Application application = (Application)context.getBean("application");
		System.out.println("Application Details : "+application);
	}
}