package com.moxito.SpringDemos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-ApplicationContext.xml");

		// retrieve the bean from spring container

		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		boolean result = (theCoach == alphaCoach);

		System.out.println("\nPointing to same object: " + result);
		System.out.println("\nMemory location of theCoach: " + theCoach);
		System.out.println("\nMemory location of alphaCoach: " + alphaCoach + "\n");

		context.close();

	}

}
