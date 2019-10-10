package com.dev.inheritance;

public class Grandfather {
  static Grandfather g= new Grandfather();
	String lastName = "Stark" ;
	String name = "Torrhen";   // globally calling

	public static void main(String[] args) {
		
		g.printName();
	
	}

	
	public void printName() {
//		String name = "Torrhen";  //local
	
		System.out.println(name+ " " +g.lastName );
	}
}
