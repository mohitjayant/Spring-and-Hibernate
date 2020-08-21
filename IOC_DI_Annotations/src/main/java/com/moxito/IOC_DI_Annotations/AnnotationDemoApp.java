package com.moxito.IOC_DI_Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read the config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		// retrieve bean from spring container
		Coach thCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println(thCoach.getDailyWorkout());

		context.close();

	}

}
