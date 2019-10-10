package com.dev.jpa.jpahibernate.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.ustglobal.bean.Car;


public class CreateDemo {

	public static void main(String[] args) {


		EntityManagerFactory  entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			Car car =new Car(); 
			
			car.setBrand("bmw");
			car.setModelNo(1234);
			car.setColor("red");
            
			car.setBrand("audi");
			car.setModelNo(1234345);
			car.setColor("red");
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager =  entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(car);
			System.out.println( "Created" );
			transaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
		}


	}

}
