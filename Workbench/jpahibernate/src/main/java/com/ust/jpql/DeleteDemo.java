 package com.ust.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDemo {

	public static void main(String[] args) {
		try {
			EntityManager entityManager= null;
			EntityTransaction transaction= null;

			EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager =  entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql= "delete from Car where color='yellow'";

			Query query = entityManager.createQuery(jpql);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

}
