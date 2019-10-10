package com.dev.arrays;

import java.lang.reflect.Array;

public class Arrays {

	public static void main(String[] args) {
		int n=2;
	int [] intArr2= {12,24,36,48,60};
	
	int k=  intArr2.length;
	if(n<k)
	{
		System.out.println("Index is present");
	
		for(int i=0;i<=n;i++) {
		System.out.println(intArr2[i]);
	}
	}
	else
	{
		System.out.println("Ïndex not present");
	}
	

	}
}



