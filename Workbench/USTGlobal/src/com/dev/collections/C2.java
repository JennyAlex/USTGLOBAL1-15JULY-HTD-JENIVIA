package com.dev.collections;

import java.util.HashSet;

import com.dev.encapsulation.Employee;


public class C2 {

	public static void main(String[] args) {
		HashSet<Employee> h = new HashSet<Employee>();
		Employee  e1= new Employee();
		e1.setName("Jenivia");
		e1.setAge(21);
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
		
		

		boolean b = h.add(e1);           
		boolean b1= h.add(e2);
		boolean b3 = h.add(e3);
		System.out.println("Output of add" +b+ " " +b1+ ""  +b3);       
		System.out.println(h);
		
		

		System.out.println("Size of HashSet hs: "+h.size());    //defines size 
		boolean b2= h.remove(e1);
		System.out.println("The output of remove " +b2);           //removes e1
		System.out.println(h);
		
		
		System.out.println("Output of contains(): "+h.contains(e2));       
		System.out.println("Size of HashSet hs: "+h.size());
		
		
		h.clear();
		System.out.println("Size of hashset after clear() : "+h.size());
		
		//update
	
		e1.setName("Jenivia");
		e1.setAge(21);
		e1.setEmail("jen123@gmail.com");
		e1.setName("jenny");
	
		System.out.println("Updated email is " +e1);

	}

}
