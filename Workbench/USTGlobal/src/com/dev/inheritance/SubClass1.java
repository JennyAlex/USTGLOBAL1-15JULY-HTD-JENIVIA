package com.dev.inheritance;

public class SubClass1 extends SuperClass1 {
	

	public SubClass1() {
		super();
	}
	public SubClass1(int i) {
		super(1);
	}
	
	public SubClass1(String str) {
		super( "abc");
	}
	
	public SubClass1(int i ,String str) {
	super(1," sdd");
	}
	public SubClass1(String str,int i) {
		super(" sdd",1);
		}
		
	

	public static void main(String[] args) {
	
    SubClass1 su = new SubClass1();
    SubClass1 su1 = new SubClass1(1);
    SubClass1 su2 = new SubClass1("abc");
    SubClass1 su3 = new SubClass1(1,"sdd");
    SubClass1 su4 = new SubClass1("sdd",1);
   
    
	}

}
