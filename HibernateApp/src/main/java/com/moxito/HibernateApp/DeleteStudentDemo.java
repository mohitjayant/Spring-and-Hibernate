package com.moxito.HibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {

	public static void main(String[] args) {

		System.out.println("Starting FactorySession");
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			int studentId = 4;

			// get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			// retrieve the student object based on id:primary key
			System.out.println("\nGetting student with id: " + studentId);
			Student myStudent = session.get(Student.class, studentId);

			// delete the student
			// System.out.println("\nDeleting student: " + myStudent);
			// session.delete(myStudent);

			// delete student id=5
			System.out.println("Deleting student with id=5");
			session.createQuery("delete from Student where id=5").executeUpdate();

			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done...");
		} finally {
			factory.close();
		}
	}

}
