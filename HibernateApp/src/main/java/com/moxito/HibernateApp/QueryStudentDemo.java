package com.moxito.HibernateApp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudentDemo {

	public static void main(String[] args) {

		System.out.println("Starting FactorySession");
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// use session object to save Java Object

			// Start a transaction
			session.beginTransaction();

			// query students
			List<Student> studentsList = session.createQuery("from Student").getResultList();

			// display students
			displayStudents(studentsList);

			// query student: lastName='Jayant'
			studentsList = session.createQuery("from Student s where s.lastName='Jayant'").getResultList();
			// display students
			System.out.println("\nSelected Students by lastName of Jayant");
			displayStudents(studentsList);

			// Query Students: lastName='Jayant' OR firstName='Naman'
			studentsList = session.createQuery("from Student s where s.lastName='Jayant' OR s.firstName='Naman'")
					.getResultList();
			System.out.println("\nStudents of lastName=Jayant OR firstName=Naman");
			displayStudents(studentsList);

			// query student where email LIKE '%magicbricks.com'
			studentsList = session.createQuery("from Student s where s.email LIKE '%magicbricks.com'").getResultList();
			System.out.println("\nStudents where email ends with magicbrick.com");
			displayStudents(studentsList);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done...");
		} finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> studentsList) {
		for (Student tempStudent : studentsList) {
			System.out.println(tempStudent);
		}
	}

}
