package com.dev.collections;

import java.util.ArrayList;

import com.dev.encapsulation.Employee;

public class C6 {


	public static void main(String[] args) {
		ArrayList<Employee> ar= new ArrayList<Employee>(2);
		Employee  e1= new Employee();
		e1.setName("Jenivia");
		e1.setAge(25);
		e1.setEmail("jen12@gmail");
		e1.setPassword("jenny");
	
		Employee  e2= new Employee();
		e2.setName("Shweta");
		e2.setAge(21);
		e2.setEmail("shw12@gmail");
		e2.setPassword("shweee");
		
		Employee  e3= new Employee();
		e3.setName("Palak");
		e3.setAge(20);
		e3.setEmail("pal@gmail");
		e3.setPassword("paliii");
 
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		System.out.println(ar);
		
		ar.trimToSize();
		System.out.println("Size of ArrayList after trimToSize" +ar.size());

	}

}














