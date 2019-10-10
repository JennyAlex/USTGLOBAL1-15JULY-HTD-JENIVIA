package com.dev.mymusic.songapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.one2one.Person;
import com.dev.one2one.VoterCard;

public class One2OneTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.setId(120);
		person.setName("qwerty");
		person.setAge(21);
		VoterCard vc = new VoterCard();
		vc.setName("asdf");
		vc.setV_id(12345);
		person.setVotercard(vc);
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction t = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em=  emf.createEntityManager();
			t = em.getTransaction();
			t.begin(); 
			//em.persist(person);
			VoterCard votercard = em.find(VoterCard.class,12345);
			votercard.getPerson().getName();


			System.out.println("Message saved");
			t.commit();
		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			em.close();
		}






	}

}
