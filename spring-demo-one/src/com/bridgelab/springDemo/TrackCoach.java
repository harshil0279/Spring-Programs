package com.bridgelab.springDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	public TrackCoach()
	{
		
	}
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it:"+fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff()
	{
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	//add a destroy mehod

	public void doMyCleanupStuffYoYo()
	{
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}
}