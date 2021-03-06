package com.moxito.SpringDemos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		// load the spring configuration file
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call method of bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		// close context
		context.close();
	}

}
