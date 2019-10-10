package com.dev.methods;  //Arithmetic operations using Method Overloading

public class ArithmeticOperations {
	static ArithmeticOperations ao= new ArithmeticOperations();
	public void print(int a, int b) {                 //Addition of 2 numbers
		int c=a+b;
		System.out.println("Addition= "+c);
		
	}
	public void print(int a, int b,int f) {       //Addition of 3 numbers
		int c=a+b+f;
		System.out.println("Addition1= "+c);
	}
	
	public void print(int a, int b,int f,int h) {  //Addition of 4 numbers
		int c=a+b+f+h;
		System.out.println("Addition2= "+c);
	}
	public void print(double aa,double bb) {      // Subtraction of two numbers
		double cc=aa-bb;
		System.out.println("Sub ="+cc);
		
	}
	
	public void print(double aa,double bb,double kk) {  //subtraction of three numbers
		double cc=aa-bb-kk;
		System.out.println("Sub1 ="+cc);
		
	}
	
	public void print(double aa,double bb,double kk,double r) {  // subtraction of  4 numbers
		double cc=aa-bb-kk-r;
		System.out.println("Sub2 ="+cc);
		
	}
	public void print (int k, double d){        // multiplication of two numbers
		double j =k*d;
		System.out.println("Multiplication= "+j);
		
	}
	public void print (int k, double d,int s){  // multiplication of three numbers
		double j =k*d*s;
		System.out.println("Multiplication1= "+j);
		
	}

	public void print (int k, double d,int s,int m){   // multiplication of 4 numbers
		double j =k*d*s*m;
		System.out.println("Multiplication2= "+j);
		
	}
	
	public void div(int a,int b) {            //division 
		int l=a/b;
		System.out.println("Division="+l);
	}
 
	public void div(int a,int b,int c) {
		int l=a/b/c;
		System.out.println("Division="+l);
	}

	public static void main(String[] args) {
		
		int qq=1;
 
	switch (qq) {
		
	case 1:ao.print(10,20,30);break;
	case 2:ao.print(10,20,300,400);break;
	case 3:	ao.print(2000.4567,300.24,40.96);break;
	case 4:	ao.print(2000.4567,300.24,40.96,10.43);break;
	case 5:	ao.print(10.6677,5.887);break;
	case 6: ao.print(120, 2.56);break;
	case 7:	ao.print(10,4.96,50);break;
	case 8:	ao.print(10,4.96,50,20);break;
	case 9:	ao.div(20,10);break;
	case 10: ao.div(500,10,30);break;
	}
		
		
	}

}
