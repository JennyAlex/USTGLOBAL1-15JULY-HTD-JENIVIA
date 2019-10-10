package com.dev.constructors;

public class ConstructorsExample1 {
	public ConstructorsExample1() {
		System.out.println("This is no arg list");
	}
	


	 public ConstructorsExample1(double d) {
		 System.out.println("This const is with double arg");
	 }


	public ConstructorsExample1(String s) {
		System.out.println("This const is with string arg");
	}
	public ConstructorsExample1(String s,int i) {
		System.out.println("This const is with string and int");
	}
	 
	public ConstructorsExample1(int i, String s,double d) {
		System.out.println("This const is with int and string and double");
	}

	public static void main(String[] args) {
		 ConstructorsExample1 ce = new ConstructorsExample1();
		 System.out.println(ce);
		 ConstructorsExample1 ce1 = new ConstructorsExample1(1);
		 System.out.println(ce1);
		ConstructorsExample1 ce2 = new ConstructorsExample1(1.3456);
		System.out.println(ce2);
		ConstructorsExample1 ce3 = new ConstructorsExample1("A");
		System.out.println(ce3);
		ConstructorsExample1 ce4 = new ConstructorsExample1("A",1);
		System.out.println(ce4);
		ConstructorsExample1 ce5 = new ConstructorsExample1(1,"A",1.3456);
		System.out.println(ce5);
		


	}

}
