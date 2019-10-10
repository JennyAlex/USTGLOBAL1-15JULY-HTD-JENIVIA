package com.dev.lambdaexp;

public class Test {

	public static void main(String[] args) {
	FuncInt f = () -> {
		for(int i=1; i<=10;i++)
		{
			System.out.println("i = "+i);
			
		}
		
	};
	


	
	
	
	
	Functional f1 = (int i) -> {
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
		
		
		
			
		
			
		
		
	};
	
	FunInterface f3 = () -> {
		try {
			int k=10/5;
			System.out.println(k);
		
		}
		catch(Exception e) {
			System.out.println("Exception......");
		}
	};
	f.printVal();
	f1.printVal(10);
	f3.print();
	}
	
}

