package com.moxito.IOC_DI_Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read the config java class

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// retrieve bean from spring container
		Coach thCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println(thCoach.getDailyWorkout());
		System.out.println(thCoach.getDailyFortune());
		context.close();

	}

}
