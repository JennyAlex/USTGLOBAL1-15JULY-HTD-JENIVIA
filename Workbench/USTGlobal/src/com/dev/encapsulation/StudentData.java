package com.dev.encapsulation;

public class StudentData {

	public static void main(String[] args) {
		Student s= new Student();
		s.setRegno(2019001);
		s.setName("Jenny");
		s.setEmail("jenn2@gmail.com");
		s.setPassword("1234");
		
	
		int regno= s.getRegno();
		System.out.println("Regno : "+regno); // we can write this way or  
		
		System.out.println("Name: "+s.getName());  // or this way
		System.out.println("Email : "+s.getEmail());
	}
}