package com.dev.polymorphism;

public class RunTimePolymorphism1 extends RunTimePolymorphism  {
	
	static RunTimePolymorphism1 s= new RunTimePolymorphism1();
	public void printName() {
		String name= "Aryan";
		 System.out.println(name+ " " +r.lastName);
	}

	public static void main(String[] args) {
	
          s.printName();
	}

}
