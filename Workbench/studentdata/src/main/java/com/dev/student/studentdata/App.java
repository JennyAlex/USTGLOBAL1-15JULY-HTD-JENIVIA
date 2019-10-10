package com.dev.student.studentdata;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.student.bean.Student;


public class App 
{
	public static void main( String[] args )
	{
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction t = null;

		Student student = new Student();
		student.setId(10);
		student.setName("Jenny");
		student.setAge(20);


		Student s1 = new Student();
		s1.setId(20);
		s1.setName("Sukanya");
		s1.setAge(21);

		Student s2 = new Student();
		s2.setId(30);
		s2.setName("bhakti");
		s2.setAge(22);

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em= emf.createEntityManager();
			t=em.getTransaction();
			t.begin();
			em.persist(student);
			em.persist(s1);
			em.persist(s2);
			System.out.println("Saved");
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}


	}
}
