package com.dev.inheritance;

public class GrandFather1 {
	static GrandFather1 g1= new GrandFather1();
	String lastName = "Lobo" ;
	String name = "Charles";   // globally calling
	

	public static void main(String[] args) {
	   g1.printName();

	}
	public void printName() {
		System.out.println(name+ " " +g1.lastName );
}
}

