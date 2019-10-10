package com.dev.threads;

public class Thread7 extends Thread {
	
	Printer p;
	public Thread7(Printer pref) {
		p=pref;
	}
	@Override
	public void run()
	{
		
	
		p.printVal(10, "Thread5");
		}
	

	public static void main(String[] args) {
	

	}

}
