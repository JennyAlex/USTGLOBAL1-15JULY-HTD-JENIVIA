package com.dev.threads;

public class Thread2 extends Thread {

	
	
	@Override
	public void run() {
		System.out.println("T2 Thread started....");
		
	     
		
		for(int j=1;j<=10;j++) {
			System.out.println("j = " +j);
	}
	
		
		
		
		System.out.println("T2 thread terminated....");
	}
	public static void main(String[] args) {
		
	}

}
