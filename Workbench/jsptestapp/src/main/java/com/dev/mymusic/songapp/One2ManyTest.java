package com.dev.mymusic.songapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.one2many.Pencil;
import com.dev.one2many.PencilBox;




public class One2ManyTest {

	public static void main(String[] args) {
		Pencil pen1 = new Pencil();
		pen1.setPid(1234567);
		pen1.setPname("qwertyudfg");

		Pencil pen2 = new Pencil();
		pen2.setPid(123);
		pen2.setPname("qwertyu");
		ArrayList<Pencil> pe = new ArrayList<Pencil>();
		pe.add(pen1);
		pe.add(pen2);

		PencilBox pb = new PencilBox();
		pb.setBoxid(23456);
		pb.setBoxname("qwertyuigh");
		pb.setPen(pe);
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction t = null;

		try {
			
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em =emf.createEntityManager();
			t = em.getTransaction();
			t.begin(); 
			System.out.println("Unidirectional");
			em.persist(pb);
			System.out.println("saved");
			t.commit();
		} catch (Exception e) {

			e.printStackTrace();
		}finally {
		em.close();
		}


	}

}
