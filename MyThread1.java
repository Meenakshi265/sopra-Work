package com.durga.synchronizedc;

public class MyThread1 extends Thread {
   
	Display d;

	public MyThread1(Display d) {
		
		this.d = d;
	}
	 public void  run() {
		 d.displayN();
	 }
	
}
