package com.bridgelab.spring;

public class AppMain {

	 public static void main(String args[]) {
	        AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	        HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
	        bean.sayHello("Spring 4");
	        context.close();
	
}
