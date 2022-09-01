package com.durga.synchronizedc;

public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Display d=new Display();
          Display d1=new Display();
          MyThread t1= new MyThread(d);
          MyThread1 t2= new MyThread1(d1);
          MyThread t3= new MyThread(d1);
          MyThread1 t4= new MyThread1(d);
          t1.start();
          t2.start();
          t3.start();
          t4.start();
 
	}

}
