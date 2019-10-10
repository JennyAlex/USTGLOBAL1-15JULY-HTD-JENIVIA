package com.dev.strings;

public class String2 {

	public static void main(String[] args) {
	
		String s ="Jenivia_Lobo";
		String s1 ="jenny_LObo";

		int length=s.length();                          //length is a method n we can find the length of the string here it is 11
		System.out.println("Length of the string--> " +length);

		char[] ch =  s.toCharArray();  
		// method returns character array n convert the whole string into a new array.
		System.out.println("The length of 0 index is----" +ch[3]);  //will give the character of the index mentioned

		char c=  s.charAt(5);  //method return type is character input argument is an integer.
		System.out.println("The character at 5th index is---"+c);


		boolean b= s.equals(s1) ;           //boolean is a return type *it should not be null,datatype should be string
		System.out.println("Str n Str1 are equal or not--- "+b);                //compare 2 strings are equal or not

 boolean h =s.equalsIgnoreCase(s1);            //return type is boolean *it should have equal length n no case sensitive
 System.out.println("Str n Str1 are equal or not---" +h);

	}


}
