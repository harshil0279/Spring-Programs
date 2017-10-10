package com.bridgelab.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//creates  an array of strings
	
	private String[] data={"Beware of the wolf in sheep's clothing",
							"Diligence is the mother of good luck",
							"The journey is the reward"
	
	};
	
	//creates a random number generator
	private Random myRandom = new Random();
	@Override
	public String getFortune() 
	{
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}