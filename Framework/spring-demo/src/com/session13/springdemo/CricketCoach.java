package com.session13.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	

	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}
	


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public CricketCoach() {
		System.out.println("CricketCoach: inside no-args constructor");
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter methods");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		
		
		return "Practice fast bowling for 15 minutes";
	}

}
