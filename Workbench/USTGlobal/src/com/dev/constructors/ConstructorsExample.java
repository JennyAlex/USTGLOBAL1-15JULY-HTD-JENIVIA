package com.dev.constructors;

public class ConstructorsExample {
	 public ConstructorsExample() {
		   System.out.println("This is no-arg const");
	   }
	 public ConstructorsExample(int i) {
		 System.out.println("This const is with int arg");
	 }

	public ConstructorsExample(String s) {
		System.out.println("This const is with string arg");
	}
	public ConstructorsExample(String s,int i) {
		System.out.println("This const is with string and int");
	}
	 
	public ConstructorsExample(int i, String s) {
		System.out.println("This const is with int and string");
	}
	 
	 
	 public static void main(String[] args) {
		  
		   
		//Constructor Overloading                                       
		 ConstructorsExample ce = new ConstructorsExample();
 ConstructorsExample ce1 = new ConstructorsExample(1);
ConstructorsExample ce2 = new ConstructorsExample("A");
ConstructorsExample ce3 = new ConstructorsExample("A",1);
ConstructorsExample ce4 = new ConstructorsExample(1,"A");

 
	 
	 }

}
