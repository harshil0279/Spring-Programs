package com.bridgelab.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author bridgeit
 *
 */
@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService; 
	//define a default constructor
	public TennisCoach()
	{
		System.out.println(">>TennisCoach: inside defailt constructor");
	}

	//define my init method
	
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");;
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff()
	{
		System.out.println(">>TennisCoach: inside of doMyCleanupStuff()");
	}
	
/*	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService)
	{	
		System.out.println(">>TennisCoach: inside a doSomeCrazyStuff method");
		fortuneService = theFortuneService;
	}*/

	/*@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();	}

}