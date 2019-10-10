package com.ust.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicCurd {

	public static void main(String[] args) {
		try {
			EntityManager entityManager= null;
			EntityTransaction transaction= null;

			EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager =  entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
//			String jpql= "update Car set brand = :nm where color=:color" ;
//			Query query = entityManager.createQuery(jpql);
//			query.setParameter("nm", "abcd");
//			query.setParameter("color", "green");
			String jpql="Delete from Car where brand=:nm" ;
			Query query = entityManager.createQuery(jpql);
			query.setParameter("nm", "abcd");
//			query.setParameter("color", "green");
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (Exception e) {
		
			e.printStackTrace();
		}


	}

}
