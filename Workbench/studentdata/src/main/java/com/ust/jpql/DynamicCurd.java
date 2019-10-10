package com.ust.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicCurd {

	public static void main(String[] args) {

		EntityManager em = null;

		EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		em    =  entityManagerFactory.createEntityManager();
		
		String dpql = "from name";
		Query query = em.createQuery(dpql);
		
		




	}

	private static void execute(Query query) {
		// TODO Auto-generated method stub
		
	}

}
