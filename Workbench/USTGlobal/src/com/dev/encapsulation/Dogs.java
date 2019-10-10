package com.dev.encapsulation;

public class Dogs {
  final  static int A =10;               // final using variable should be declared in block letter
  
  final static void print() {
	  System.out.println("Final method");
  }
  
  public static void main(String[] args) {
	  System.out.println(A);
//	  A= 11;
  }

}
