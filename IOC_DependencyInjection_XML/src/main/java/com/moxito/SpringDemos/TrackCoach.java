package com.moxito.SpringDemos;

public class TrackCoach implements Coach {

	private FortuneService theFortuneService;

	public TrackCoach(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard on Track";
	}

	@Override
	public String getDailyFortune() {
		return "Great News: " + theFortuneService.getFortune();
	}

}
