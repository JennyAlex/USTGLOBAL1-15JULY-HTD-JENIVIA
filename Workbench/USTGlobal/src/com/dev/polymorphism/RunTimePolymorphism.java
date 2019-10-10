package com.dev.polymorphism;

public class RunTimePolymorphism {
	
	static RunTimePolymorphism r= new  RunTimePolymorphism();
		String lastName= "khan";
	
	
	public void printName() {
		String name= "Shahrukkh";

	
		System.out.println(name+ " " +r.lastName);
	}

	public static void main(String[] args) {
         r.printName();

	}


}

