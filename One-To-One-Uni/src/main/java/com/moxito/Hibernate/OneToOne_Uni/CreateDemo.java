package com.moxito.Hibernate.OneToOne_Uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.moxito.Hibernate.Entity.Instructor;
import com.moxito.Hibernate.Entity.InstructorDetail;

public class CreateDemo {

	public static void main(String[] args) {

		System.out.println("Starting SessionFactory: ");
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// create the object
			Instructor tempInstructor = new Instructor("Mohit", "Jayant", "mohitj8790@gmail.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail(
					"https://www.youtube.com/watch?v=sQiGelfDFvQ&ab_channel=NewsTodayHindi", "Spy Fiction");

			// associate the object
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			// start a transaction
			session.beginTransaction();

			// save the instructor
			System.out.println("Saving the Instructor: " + tempInstructor);
			session.save(tempInstructor);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done...");
		} finally {
			factory.close();
		}
	}

}
