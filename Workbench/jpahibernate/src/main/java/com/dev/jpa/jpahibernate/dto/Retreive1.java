package com.dev.jpa.jpahibernate.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.ustglobal.bean.Car;

public class Retreive1 {

	public static void main(String[] args) {
		EntityManagerFactory  entityManagerFactory = null;
		EntityManager  entityManager = null;
		EntityTransaction transaction = null;

		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction.begin();
			//      Car car = entityManager.find(Car.class,"red");
			//      System.out.println(car.getClass());
			Car car = entityManager.getReference(Car.class,"audi");//another method of reading data
			System.out.println(car.getClass());
			System.out.println(entityManager.contains(car));
			entityManager.detach(car);
			System.out.println(entityManager.contains(car));
   car.setBrand("merc");
   transaction.commit();
		} catch (Exception e) {
		transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	  
	
	
//		System.out.println("Car Name ="+car.getBrand());
//		System.out.println("Car Model= "+car.getModelNo());
//		System.out.println("Car Color= "+car.getColor());



	}

}
