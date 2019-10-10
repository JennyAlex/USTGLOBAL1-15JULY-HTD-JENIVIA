package com.dev.inheritance;

public class Parent {
	
	
	


		public void  over() {
			System.out.println(" Overriden Parent");
		}
		
		private void over1 () {
			System.out.println(" "); //private cannot be overriden
			
		}
		
		final void over2 () {
			System.out.println(" ");  //final cannot be overriden
		}
		
		
		public static void over3 () {       //static also cannot be overriden
			System.out.println(" ");
		}
		
		public static void main(String[] args) {
	
			
		

	}

}
