package com.dev.strings;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Some_String";
		String str1 ="some_String";

		int length=str.length();                          //length is a method n we can find the length of the string here it is 11
		System.out.println("Length of the string--> " +length);

		char[] ch =  str.toCharArray();  
		// method returns character array n convert the whole string into a new array.
		System.out.println("The length of 0 index is----" +ch[5]);  //will give the character of the index mentioned

		char c=  str.charAt(4);  //method return type is character input argument is an integer.
		System.out.println("The character at 5th index is---"+c);


		boolean b= str.equals(str1) ;           //boolean is a return type *it should not be null,datatype should be string
		System.out.println("Str n Str1 are equal or not--- "+b);                //compare 2 strings are equal or not

 boolean h =str.equalsIgnoreCase(str1);            //return type is boolean *it should have equal length n no case sensitive
 System.out.println("Str n Str1 are equal or not---" +h);

	boolean v= str.contains("som"); //returns true if string contains specified character sequence
	System.out.println("Output for contains()---"+v);   //not ignoring cases 
	
	
	String g =str.replace('S' ,'A');  //replaces the old char with new char
	System.out.println("OLd char changes to new char--- "+g);   //case sensitive matters
	 
 	int f= str.indexOf('S');    //returns type integer n  returning the index of character no char is present then -1 is printd
	 System.out.println("the index of character---"+f);
	 
	 
	String s=str.toUpperCase();
	System.out.println(s);
	
	
	String l=str.toLowerCase();
	System.out.println(l);
	
	String a= str.substring(3);              //will print all the char after index 3 
	System.out.println("Output for substring() :" +a);
	
String q = str.substring(3,7);                     // will print from index 3 to 7 whenever we are using input with 2 argument beg index and end index 
   System.out.println("ouput for substring");       //beg index is included not the end index                                                    //	String q = str.substring(begin index,end index)
	
	
	}


}
