package com.dev.student.studentdata;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.student.bean.Student;

public class DetachRetach {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		   EntityTransaction t = null;
		   
		
			try {
				emf = Persistence.createEntityManagerFactory("TestPersistence");
				   em = emf.createEntityManager();
				   t = em.getTransaction();
				   t.begin();
				Student stu =  em.find(Student.class,10);
				System.out.println(em.contains(stu)); 
				em.detach(stu);
				System.out.println(em.contains(stu));
			stu.setName("fghj");
			
			Student s1 = em.merge(stu);
			System.out.println(em.contains(s1));
					
				t.commit();
				
				
				   
			} catch (Exception e) {
			   t.rollback();
				e.printStackTrace();
			}

	}

}
