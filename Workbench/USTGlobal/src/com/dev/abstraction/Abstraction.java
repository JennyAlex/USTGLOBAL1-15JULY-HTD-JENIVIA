package com.dev.abstraction;

public  class Abstraction extends AbstractExample {

  public Abstraction() {
	  System.out.println("Cost of Abstraction class");
  }

public static void main(String[] args) {
	Abstraction a = new Abstraction();
	a.display();
	a.show();
	a.print();
	
}

@Override
void display() {
	System.out.println("This is is the implemented abstract method");
	
}

@Override
void print() {
System.out.println("This is another implemented method");
	
}
}