package com.dev.strings;

public class String1 {
	public static void main(String []args) {
		String str;
		str = "Hello";
		
		String str1= "Java";
		String str2= new String("Hello Java");
		
		
		
		StringBuffer sb= new StringBuffer("Hello");     //String buffer needs to be created in an object
		StringBuilder sbi = new StringBuilder("Java");   //string builder same
		
		/* StringBuffer sb1= new StringBuffer(-1);    this will give negative array size exception error*/
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(sb);                        //string buffer
		System.out.println(sbi);                      //string builder 
        System.out.println(sb.length());
        System.out.println(sb.capacity());
	}        
}
