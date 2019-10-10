package com.dev.mymusic.songapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.bean.Movie;

public class Retrieval {
	EntityManager entityManager= null;
    //for retrieval no need of transaction
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	Movie movie = entityManager.find(Movie.class,101);
	System.out.println("Movie Id==== " +movie.getId());
	System.out.println("Movie Name=== "+movie.getName());
	System.out.println("Movie Rating ===="+movie.getRating());
	System.out.println("saved");
	
	
	

	}

}
