package com.dev.mymusic.songapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.bean.Movie;

public class ReAttach {

	public static void main(String[] args) {
		EntityManagerFactory  entityManagerFactory = null;
		EntityManager  entityManager = null;
		EntityTransaction transaction = null;

		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
		      Movie movie = entityManager.find(Movie.class,23);
//			      System.out.println(movie.getClass());
			
			System.out.println(entityManager.contains(movie));
			entityManager.detach(movie);
			System.out.println(entityManager.contains(movie));
   movie.setRating("excellent");
   Movie m1 = entityManager.merge(movie);
	System.out.println(entityManager.contains(m1));
	
   transaction.commit();
		} catch (Exception e) {
		transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	  

	}

}
