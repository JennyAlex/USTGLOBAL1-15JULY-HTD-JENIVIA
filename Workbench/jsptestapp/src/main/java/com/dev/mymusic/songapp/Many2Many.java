package com.dev.mymusic.songapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.many2many.Course;
import com.dev.many2many.Student;

public class Many2Many {

	public static void main(String[] args) {
		Course course = new Course();
		course.setCid(3);
		course.setCname("java");
		Course course1= new Course();
		course1.setCid(4);
		course1.setCname("sql");
		ArrayList<Course> arraylist = new ArrayList<Course>();
		arraylist.add(course);
		arraylist.add(course1);
		Student stu = new Student();
		stu.setSid(103);
		stu.setSname("java");
		stu.setCourse(arraylist);
	
		Student stu1 = new Student();
		stu1.setSid(104);
		stu1.setSname("sql");
		stu1.setCourse(arraylist);
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction t = null;

		
			
			try {
				emf = Persistence.createEntityManagerFactory("TestPersistence");
				em =emf.createEntityManager();
				t = em.getTransaction();
				t.begin(); 
				System.out.println("");
				em.persist(stu);
				em.persist(stu1);
				System.out.println("saved");
				t.commit();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		

	}

}
