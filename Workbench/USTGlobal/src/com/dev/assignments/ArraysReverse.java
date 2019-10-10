package com.dev.assignments;

import java.util.Scanner;

public class ArraysReverse {
	

	public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int [] arr =new int[5];
        System.out.println(" How any elements to insert in an array ?");
        int n= s.nextInt();              // next integer
        System.out.println("Enter Elements");
        for(int i=0;i<=n;i++) {
        arr[i] = s.nextInt();
        }
   System.out.println("Display array");
   for(int i=0;i<=n;i++) {
	   System.out.println("Element at position "+i+ "  is "+arr[i] );
	   
   }
   System.out.println("Reverse array" );
   for(int i = arr.length-1;i>=0;i--) {
	   System.out.println("Element at position "+i+ "is "+arr[i]);
	   
	  
   }
   
	}

}
