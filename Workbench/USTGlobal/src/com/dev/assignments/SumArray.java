package com.dev.assignments;



public class SumArray {

	public static void main(String[] args) {
		
		
	int arr []= {1,2,3,4,5,6,7};
	int first,mid,last;
	first = arr[0];
	System.out.println("First element " +first);
	mid = arr[arr.length / 2] ;
	System.out.println("Mid Element "+mid);
	
	last= arr[arr.length -2];
	System.out.println("Last Element "+last);
	int sum= first+mid+last;
	
	
	System.out.println("Display Sum = "+sum);
	

}
}
