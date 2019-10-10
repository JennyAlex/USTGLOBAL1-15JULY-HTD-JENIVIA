package com.dev.arrays;

public class CreatingArrays {
	
	public static void main(String [] args) {
		int []intArr; //declaration
		char[] chArr;
		byte byteArr[];
		
		
		
		 //int[] intArr=new int[5]  for declaratioon and creation together
		
       intArr=new int[5];      //declaration       
		chArr=new char[5];
		byteArr=new byte[5];
		
		
		intArr[0] =70;             //initialization
		intArr[1]=200;
		intArr[2]=376;
		intArr[3]=450;
		intArr[4]=500;
		
		int res =intArr[1] *3;       // it will multiply wit array no1 to 3
		System.out.println(res);
		
		int add =intArr[0] +3;       // it will add  wit array no1 to 3
		System.out.println(add);
		
		int mod =intArr[2] % 3;       // it will mod  wit array no1 to 3
		System.out.println(mod);
		
		int div =intArr[3] /3;       // it will division  wit array no1 to 3
		System.out.println(div);
		
		int sub =intArr[4]-3;       // it will sbtract  wit array no1 to 3
		System.out.println(sub);
		
		int [] intArr2 ={11,22,33,44,55};
		System.out.println( intArr2[2]);  //declare and initialize
			System.out.println("Length of the 2nd array :"+intArr2.length);	                  
				
		chArr[0]= 'e';
		chArr[1]='d';
		chArr[2]='c';
		chArr[3]='b';
		chArr[4]='a';
		 
		byteArr[0]=10;
		byteArr[1]=20;
		byteArr[1]=30;
		byteArr[3]=40;
		byteArr[4]=50;
			
	}

}
