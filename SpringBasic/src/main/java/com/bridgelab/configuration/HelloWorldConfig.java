package com.bridgelab.configuration;

@Configuration
public class HelloWorldConfig {

	
	@Bean(name="helloWorldBean")
    @Description("This is a sample HelloWorld Bean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
