package com.session13.springdemo;

public class BaseballCoach  implements Coach{
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout()
	{
		return "Sepnd 30 minutes on batting practice";
	}

	@Override
	public String getFortune() {
		// use my fortune service to get the fortune
		return fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff()
	{
		System.out.println("Baseball Coach: inside startup method");
	}
	//add a destroy method
	public void doMyCleanupStuff()
	{
		System.out.println("Baseball Coach: inside cleanup method");
	}
	

}
