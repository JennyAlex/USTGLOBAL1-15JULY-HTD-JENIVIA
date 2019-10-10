package com.dev.assignments;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println(" Enter String");
		String str= s.next();        //next string
		String rev= "";
//		System.out.println("Reverse String");
		for(int i=str.length()-1; i>=0;i--) {
			rev=rev+str.charAt(i);
			
			
		}
		System.out.println("Reverse String :  "+rev);
		
	
		
	
	}

}
