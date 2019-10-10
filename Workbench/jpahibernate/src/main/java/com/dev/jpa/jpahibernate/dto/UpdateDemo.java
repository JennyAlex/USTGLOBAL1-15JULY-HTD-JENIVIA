package com.dev.jpa.jpahibernate.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.ustglobal.bean.Car;

public class UpdateDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager =	entityManagerFactory.createEntityManager();
			transaction =	entityManager.getTransaction();
			transaction.begin();
			Car car= entityManager.find(Car.class,"audi");
			car.setColor("yellow");
			System.out.println("Updated");
			transaction.commit();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			entityManager.close();
		}
		
	
		
		

	}

}
