package com.moxito.SpringDemos;

public class BaseballCoach implements Coach {

	// private field for dependency
	private FortuneService theFortuneService;

	// constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes in ground";
	}

	@Override
	public String getDailyFortune() {
		return theFortuneService.getFortune();
	}

}
