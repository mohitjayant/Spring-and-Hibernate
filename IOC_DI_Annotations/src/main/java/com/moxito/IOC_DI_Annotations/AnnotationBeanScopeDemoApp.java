package com.moxito.IOC_DI_Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// read the config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		// retrieve the bean from spring container

		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		boolean result = (theCoach == alphaCoach);

		System.out.println("\nPointing to same object: " + result);
		System.out.println("\nMemory address of theCoach: " + theCoach);
		System.out.println("\nMemory address of alphaCoach: " + alphaCoach);

		context.close();
	}

}
