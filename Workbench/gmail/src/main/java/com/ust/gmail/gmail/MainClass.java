package com.ust.gmail.gmail;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.account.dto.Account;
import com.dev.account.dto.Inbox;



public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number..");
		System.out.println("1....Login");
		System.out.println("2....Register");
		Account acc1= new Account();
		Inbox in = new Inbox();

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction t = null;
		int n=sc.nextInt();
		switch(n) {
		case 1:System.out.println("Login");

		String email= sc.nextLine();
		System.out.println("Enter ur emailId"+email);
	    acc1.setEmail(email);
		String password = sc.nextLine();
		System.out.println("Enter password"+password);
		acc1.setEmail(email);
		acc1.setInbox(in);
		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em= emf.createEntityManager();
			t = em.getTransaction();
			t.begin();
//			Inbox inn = em.find(Inbox.class,sc.nextInt());

			em.persist(acc1);
			t.commit();
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("1: Compose");
		System.out.println("2: Show Inbox");


		int k = sc.nextInt();
		switch(k) {
		case 1: System.out.println("Compose");
	
		System.out.println("Enter ur emailId");
		String email2= sc.nextLine();
		acc1.setEmail(email2);
		
//		System.out.println("Enter Message");
//		String mess = sc.nextLine();
		
		acc1.setInbox(in);
		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em= emf.createEntityManager();
			t = em.getTransaction();
			t.begin();
//			Inbox inn = em.find(Inbox.class,sc.nextInt());

			em.persist(acc1);
			t.commit();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		

		case 2: System.out.println("Inbox");
		System.out.println("Enter mess");
		String mess= sc.nextLine();
		in.setMessage(mess);
         sc.nextLine();

	System.out.println("Enter password");
	
		String password1 = sc.nextLine(); 
	acc1.setPassword(password1);
		
		

	System.out.println("Enter ur email");
		String email1= sc.nextLine();
		acc1.setEmail(email1);
	System.out.println("saved");


		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em= emf.createEntityManager();
			t = em.getTransaction();
			t.begin();
		  


			em.persist(acc1);
			t.commit();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		}
		break;

		case 2: 

	System.out.println("Enter ur username");
		String user= sc.nextLine();
		acc1.setUser_name(user);
         sc.nextLine();

		System.out.println("Enter password");
	
		String password1 = sc.nextLine();
		acc1.setPassword(password1);
		
		

		System.out.println("Enter ur email");
		String email1= sc.nextLine();
		acc1.setEmail(email1);
		System.out.println("saved");


		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em= emf.createEntityManager();
			t = em.getTransaction();
			t.begin();
		  


			em.persist(acc1);
			t.commit();
		} catch (Exception e) {

			e.printStackTrace();
		}break;

		}





	}
}



