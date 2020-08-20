package com.moxito.SpringDemos;

public class CricketCoach implements Coach {

	private String emailAddress;
	private String team;
	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("CricketCoach: inside the no -arg constructor");
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method -setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method -setTeam");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method of FortuneService");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for at least 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
