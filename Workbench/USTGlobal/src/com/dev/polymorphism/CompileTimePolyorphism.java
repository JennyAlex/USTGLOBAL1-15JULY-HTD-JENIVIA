package com.dev.polymorphism;

public class CompileTimePolyorphism {
	
	static CompileTimePolyorphism a=  new  CompileTimePolyorphism();
	
	public void print(int g,int h) {
		int j = g+h;
		System.out.println("Addition  = "+j);
	}
	
	public void print(int g,int h,int k) {
		int j = g+h+k;
		System.out.println("Addition  = "+j);
	}
	 public void mul(int a,int b) {
		 int l=a*b;
		 System.out.println("Multiplication = " +l);
		 
	 }
	
	public static void main(String[] args) {
       a.print(12,39);
       a.print(500, 100,10000);
       a.mul(20,30);

	}
 

}
