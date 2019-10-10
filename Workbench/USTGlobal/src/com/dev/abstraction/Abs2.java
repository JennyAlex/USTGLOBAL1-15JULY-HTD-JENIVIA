package com.dev.abstraction;


@FunctionalInterface
public interface Abs2 {
	void display();
	
	static void print() {
		System.out.println("A");
	}
	static void print1() {
		System.out.println("A"); 
	}

}
