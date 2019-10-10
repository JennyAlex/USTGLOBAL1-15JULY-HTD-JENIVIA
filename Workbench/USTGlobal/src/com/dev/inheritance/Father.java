package com.dev.inheritance;

public class Father extends Grandfather {
	 static Father f = new Father();
	 String name= "Eddard";  //global 
	 @Override
 public void printName() {
//	 String name= "Edward";     //local
	
	 System.out.println(name+ " " +super.name+ " " +f.lastName); 
	 super.printName();   //print grandfathers name                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
 }
	 
 public static void main(String[] args) {
		f.printName();

 }
	}


	