package com.durga;

public class PriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t=new MyThread1();
		
		
		System.out.println(" main ="+Thread.currentThread().getPriority());
	
		t.setPriority(10);
		t.start();
		
		   for(int i=0;i<5;i++) {
			   System.out.println(" main  thread :");
		   }

	}

}
 class MyThread1 extends Thread{
	 
	 public   void run() {
		 System.out.println(" child ="+Thread.currentThread().getPriority());
		   for(int i=0;i<5;i++) {
			   System.out.println(" child thread :");
			   Thread.yield();
			   for(int j=0;j<5;j++) {
				   System.out.println(" chlid thread :");
				   Thread.yield();
			   }
		   }
	  }
 }