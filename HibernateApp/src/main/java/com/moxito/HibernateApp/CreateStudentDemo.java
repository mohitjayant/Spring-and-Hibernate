package com.moxito.HibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

	public static void main(String[] args) {

		System.out.println("Starting FactorySession");
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// use session object to save Java Object

			// create a Student object
			System.out.println("Creating Student Object...");
			Student theStudent = new Student("Sahaj", "Jayant", "mohit8790j@gmail.com");
			// Start a transaction
			session.beginTransaction();
			// save the Student object
			System.out.println("saving the student....");
			session.save(theStudent);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done...");
		} finally {
			factory.close();
		}
	}

}
