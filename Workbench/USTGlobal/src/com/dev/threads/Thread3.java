package com.dev.threads;

public class Thread3 implements Runnable {
	
	
	
	@Override
	public void run() {
		System.out.println("T3 thread started.......");
		
		for(int k=1;k<=10;k++) {
			System.out.println("k = " +k);
	}
		
		
		System.out.println("T3 Thread terminated..........");
	}

	public static void main(String[] args) {
	

	}

}
