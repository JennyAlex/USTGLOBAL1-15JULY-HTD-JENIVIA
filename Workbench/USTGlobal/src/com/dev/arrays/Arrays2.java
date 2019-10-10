package com.dev.arrays;

public class Arrays2 {

	public static void main(String[] args) {
		int [] intArr= {100,240,500,480,600};
		int l=  intArr.length;                      //length is a keyword
		int n= l/2 ; //middle no.
		
		
		int g=l-2;  //second last no.
		{
			System.out.println(intArr[n]);
			System.out.println(intArr[g]); 
			
		}

	}

}

