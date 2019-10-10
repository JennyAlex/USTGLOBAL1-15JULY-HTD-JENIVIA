package com.dev.mymusic.songapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.bean.Movie;

public class Updation {
	
	public static void main(String[] args) {
		 EntityManager entityManager= null;
		  EntityTransaction transaction= null;
	
		
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager = entityManagerFactory.createEntityManager();
			 transaction = entityManager.getTransaction();
			transaction.begin();
			Movie movie = entityManager.find(Movie.class,23);
			movie.setName("kal");
			System.out.println("Movie updated");
			transaction.commit();
		} catch (Exception e) {
	
			e.printStackTrace();
			entityManager.close();
		}
		
		

	}//end of main class

} // end of class
