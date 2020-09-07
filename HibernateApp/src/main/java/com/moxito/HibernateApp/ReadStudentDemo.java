package com.moxito.HibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

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
			Student theStudent = new Student("Anuj", "Kamra", "anuj.kamra@gmail.com");
			// Start a transaction
			session.beginTransaction();
			// save the Student object
			System.out.println("saving the student....");
			System.out.println(theStudent);
			session.save(theStudent);

			// commit transaction
			session.getTransaction().commit();

			// find out the student id: primary key
			System.out.println("Saved Student, Generated id: " + theStudent.getId());

			// get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			// retrieve the student object based on id:primary key
			System.out.println("\nGetting student with id: " + theStudent.getId());
			Student myStudent = session.get(Student.class, theStudent.getId());
			System.out.println("Get complete: " + myStudent);
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done...");
		} finally {
			factory.close();
		}
	}

}
