package com.dev.threads;

public class SyncMainMethod {

	public static void main(String[] args) throws InterruptedException {
	System.out.println("SyncMain Thread started......");
	Printer p= new 	Printer();
	Thread4 t4=new Thread4(p);
	t4.start();
	t4.join();
	//new Thread4(p).start();

               //new Thread4(p).join();
	   
	new Thread5(p).start();
	
//	for(int i=0;i<=10;i++) {
//		System.out.println(i);
//	}
	System.out.println("SyncMain Thread terminated");

	}

}
