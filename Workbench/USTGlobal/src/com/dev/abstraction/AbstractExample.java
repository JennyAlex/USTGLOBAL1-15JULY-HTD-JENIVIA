package com.dev.abstraction;

public abstract class AbstractExample {     // declare abstract class with abstract keyword becaue abstract method is called
	
	abstract void print();         //abstract methods
	abstract void display();  //cannot create body
	public void show() {
		System.out.println("Concrete method of abstract class");
	}
	public AbstractExample() {
		System.out.println(" This is constuctor abstract class");
	}

	public static void main(String[] args) {
		
	}

}
