package com.dev.exceptions;

public class ExceptionHandling {
   
	
	
	public static void main (String [] args)  {
	
	try {
			s();
		}catch(Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}finally {
			System.out.println("This is finally block");
		}
	   System.out.println("Code after execution");
	}
	
		
		
		 public static void s()  {
			 StringBuffer sb= new StringBuffer(-1);
			 
			 
			
			
	}
}
