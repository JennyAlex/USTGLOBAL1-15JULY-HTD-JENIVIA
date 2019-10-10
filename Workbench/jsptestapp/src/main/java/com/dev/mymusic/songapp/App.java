package com.dev.mymusic.songapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.bean.Movie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityTransaction transaction = null;
   	 EntityManager entityManager= null;
    	try {
    	
    	
       Movie movie =new Movie();  
       movie.setId(101);
       movie.setName("Kabir Singh");
       movie.setRating("Very good");
       
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
        entityManager= entityManagerFactory.createEntityManager();
       transaction = entityManager.getTransaction();
       transaction.begin();
       entityManager.persist(movie);
    	System.out.println( "saved" );
    transaction.commit();
  
    	}catch(Exception e)
    	{
        transaction.rollback();
        e.printStackTrace();
    	}	finally {
    		entityManager.close();
    	}
    }
}
