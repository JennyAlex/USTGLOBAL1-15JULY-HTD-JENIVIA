package com.dev.inheritance;

public class Daughter extends Father {
	static Daughter d = new Daughter();
	static Grandfather d1= new Daughter();
	static Daughter d2= (Daughter) d1;
	@Override
	public void printName() {
		String name= "Sansa";
		System.out.println(name+ " "+super.name+ " " +d.lastName);
	}

	public static void main(String[] args) {
		d.printName();

	}

}
