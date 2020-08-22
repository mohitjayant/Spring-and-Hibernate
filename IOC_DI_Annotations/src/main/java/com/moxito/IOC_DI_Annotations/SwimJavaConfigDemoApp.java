package com.moxito.IOC_DI_Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read the config java class

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// retrieve bean from spring container
		SwimCoach thCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(thCoach.getDailyWorkout());
		System.out.println(thCoach.getDailyFortune());
		System.out.println("email: " + thCoach.getEmail());
		System.out.println("team: " + thCoach.getTeam());
		context.close();

	}

}
