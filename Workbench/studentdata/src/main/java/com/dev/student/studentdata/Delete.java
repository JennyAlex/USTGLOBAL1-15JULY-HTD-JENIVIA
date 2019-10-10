package com.dev.student.studentdata;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.student.bean.Student;

public class Delete {

	public static void main(String[] args) {
		  EntityManagerFactory emf = null;
		   EntityManager em = null;
		   EntityTransaction t = null;
		   
		   try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			   em = emf.createEntityManager();
			   t = em.getTransaction();
			   t.begin();
			   Student s = em.find(Student.class,20);
			 s.setName("Sukanaya Pattil");  //update
//			   em.remove(s);                //delete
			
			   System.out.println("updated");
			   t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
		   
		   
		   

	}

	private static void remove(Student s) {
		// TODO Auto-generated method stub
		
	}

}
