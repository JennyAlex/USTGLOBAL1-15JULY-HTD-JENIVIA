package com.dev.practise;

public class Employee1 {

	public static void main(String[] args) {
		EmpImplement k = new EmpImplement();
		Employee e1=new Employee();
		
		e1.setName("Jenny");
		e1.setId(101);
		e1.setAge(20);
		e1.setEmail("jeni@gmail.com");
		boolean b= k.put("1", e1);
		System.out.println(b);
		k.get();
		 
		Employee e2= new Employee();
		e2.setName("Alisha");
		e2.setId(102);
		e2.setAge(23);
		e2.setEmail("ali12@gmail.com");
		boolean b1=k.put("2", e2);
		System.out.println(b1);
		k.get();
		
		boolean b2= k.remove("1", e1);
		System.out.println(b2);
		k.get();
		
		e1.setName("Jenivia");
		k.put("1", e1);
		k.get();
		
				
		

	}

}
