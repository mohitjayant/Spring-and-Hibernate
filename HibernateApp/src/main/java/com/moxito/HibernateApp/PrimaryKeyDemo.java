package com.moxito.HibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

	public static void main(String[] args) {

		System.out.println("Starting FactorySession");
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// use session object to save Java Object

			// create 3 Student object
			System.out.println("Creating 3 Student Object...");
			Student theStudent1 = new Student("Sahaj", "Jayant", "mohit8790j@gmail.com");
			Student theStudent2 = new Student("Naman", "Bajaj", "namanbajaj@gmail.com");
			Student theStudent3 = new Student("Mayur", "Khandelwal", "mayur@gmail.com");
			// Start a transaction
			session.beginTransaction();
			// save the Student object
			System.out.println("saving the student....");
			session.save(theStudent1);
			session.save(theStudent2);
			session.save(theStudent3);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done...");
		} finally {
			factory.close();
		}
	}

}
