package com.dev.strings;

public class Test1 {

	char a= 'A';
	static int i= 10;
	static int j= 15;
	
	public static void main(String[] args) {
		System.out.println(i++);   //print 10 store 11
		System.out.println(++j);   //print 16
		System.out.println(++i + j++);  //stored 11 will increase to 12 and j will print 16 but store 17
		
		String s1= "Myran";
		String s2= "Ryan";
		System.out.println(s2=s1);   //assigning value


		System.out.println(i++);
		System.out.println(j++);		int c= i+j;
		System.out.println(c);
	int i= 10;
		System.out.println(i++);
	System.out.println(++i);
	
		
		int a=10;
		a++;
		System.out.println(a++);
	}

}
