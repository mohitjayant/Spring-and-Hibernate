package com.moxito.IOC_DI_Annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = { "Turn the paper over and fold all the corners into the center again",
			"The Fool marks the beginning of a journey.", "take a glimpse into the future" };

	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String myFortune = data[index];
		return myFortune;
	}

}
