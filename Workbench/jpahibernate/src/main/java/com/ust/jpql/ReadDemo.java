package com.ust.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.dev.ustglobal.bean.Car;

public class ReadDemo {

	public static void main(String[] args) {
		EntityManager entityManager= null;
		EntityTransaction transaction= null;

		EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager =  entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		//	 String jpql= "from Car";  // to select all
		//		 String jpql= "select brand from Car";
		String jpql= "update Car set brand ='sedrftg' where color='yellow'";

		Query query = entityManager.createQuery(jpql);
		int executeUpdate = query.executeUpdate();
		System.out.println(executeUpdate);
		transaction.commit();
		//		List<String> resultList = query.getResultList();
		//		List<Car> resultList = query.getResultList();  

		//		for (Car car : resultList) {
		//			System.out.println(car.getBrand());
		//		System.out.println(car.getModel());
		//		System.out.println(car.getColor());
		//		}

		//	for (String string : resultList) {
		//		System.out.println(string);
		//
		//		}

		//		System.out.println(car.getBrand());

		//	System.out.println(car.getModel());
		//	System.out.println(car.getColor());
		//	}


	}

}
