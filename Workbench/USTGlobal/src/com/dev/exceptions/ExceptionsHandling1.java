package com.dev.exceptions;

import java.util.Queue;

public class ExceptionsHandling1 {

	public static void main (String[] args) throws CustomException {
	
		
		
		try {
			s();
			System.out.println("No Exception for s() ");
			int res = divide(10,0);
			System.out.println("No Exception for divide()");
			System.out.println(res);
			
		}catch (NegativeArraySizeException e) {       //if multiple catch block is used then
			System.err.println("Exception caught in catch block");
			System.err.println("getMessage() : "+e.getMessage());
			e.printStackTrace();
			
		}
		catch ( ArithmeticException e)  {
			System.err.println("Exception caught in catch block");
			System.err.println("getMesssage(): "+e.getMessage());
		}finally {
			System.out.println("Finally Block");
		}

	}

	public static int divide(int i, int j) {
		int res = i/j;
	
		return res;
		
	}

	
	
	public static void s() {
		 {
			StringBuffer sb = new StringBuffer(-1);
		} 
		
	 } 
}   
