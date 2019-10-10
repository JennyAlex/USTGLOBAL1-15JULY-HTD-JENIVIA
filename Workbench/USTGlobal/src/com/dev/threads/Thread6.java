package com.dev.threads;

public class Thread6 extends Thread {
	
	Printer p;
	public Thread6(Printer pref) {
		p=pref;
	}
	@Override
	public void run()
	{   try {
		Thread.currentThread().sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		p.printVal(10, "Thread4");
	}

	
}
