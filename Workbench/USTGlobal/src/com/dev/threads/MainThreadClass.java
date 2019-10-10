package com.dev.threads;

public class MainThreadClass {

	public static void main(String[] args) {
		System.out.println("Main thread started.....");
		System.out.println("MainThreadClass prints the value of i");
		
//		new T2().start(); //to start the execution for this create object
	
		
		Thread2 t2= new Thread2();
		t2.start();
		t2.setName("Thread t2");
		
//		Thread t2= new Thread(t2);
	
	
		 
		 Thread3 t3=new Thread3();
		Thread t=new Thread(t3);
		t.start();
		
		Thread.currentThread().setName("Main Thread");
		t2.setPriority(5);
		System.out.println();
		t.setPriority(2);
		System.out.println();
		Thread.currentThread().setPriority(1);
		System.out.println();
		
		
		//new Thread(new T3()).start();  it can be written in this form too
		
		System.out.println("THread t2 = "+t2.getName());
		System.out.println("ThreadName1: "+Thread.currentThread().getName());
		System.out.println("Thread2 id: "+t2.getId());
		System.out.println("Thread3 id : "+t.getId());
		System.out.println("Main THread id : " +Thread.currentThread().getId());
		System.out.println("Main Thread Terminated.........");
		System.out.println("Thread Priority 2 = "+t2.getPriority());
		System.out.println("Thread Priority 3 = " +t.getPriority());
		System.out.println("Main Thread Priority = "+Thread.currentThread().getPriority());
		
		
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//	}
//	
//	
//	
//	
//	System.out.println("Main Thread Terminated.....");

	}

}
