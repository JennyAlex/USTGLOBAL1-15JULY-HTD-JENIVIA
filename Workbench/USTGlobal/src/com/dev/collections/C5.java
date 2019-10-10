package com.dev.collections;

import java.util.TreeSet;

import com.dev.encapsulation.Employee;

public class C5 {

	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<Employee>();
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

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		System.out.println(ts);
		
		
	}

}
