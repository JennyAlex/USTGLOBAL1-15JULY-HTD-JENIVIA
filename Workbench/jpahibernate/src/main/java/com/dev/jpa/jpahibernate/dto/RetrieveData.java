package com.dev.jpa.jpahibernate.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dev.ustglobal.bean.Car;


public class RetrieveData {

	public static void main(String[] args) {
           EntityManagerFactory  entityManagerFactory = null;
         EntityManager  entityManager = null;
      entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
      entityManager = entityManagerFactory.createEntityManager();
      Car car = entityManager.find(Car.class,"bmw");
      System.out.println("Car Name ="+car.getBrand());
      System.out.println("Car Model= "+car.getModelNo());
      System.out.println("Car Color= "+car.getColor());

	}

}
