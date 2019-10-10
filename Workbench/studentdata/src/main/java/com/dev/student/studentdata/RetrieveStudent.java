package com.dev.student.studentdata;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.student.bean.Student;

public class RetrieveStudent {

	public static void main(String[] args) {
   EntityManagerFactory emf = null;
   EntityManager em = null;
   
   try {
	emf = Persistence.createEntityManagerFactory("TestPersistence");
	   em = emf.createEntityManager();
	   Student s =   em.find(Student.class,10);
	   System.out.println("Id...."+s.getId());
	   System.out.println("Name..."+s.getName());
	   System.out.println("Age....."+s.getAge());
	   
} catch (Exception e) {
	
	e.printStackTrace();
}
   
   
   
   
   

	}

}
