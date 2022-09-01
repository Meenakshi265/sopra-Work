package com.durga;

public class MyThread  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ThreadDemo  t=new  ThreadDemo ();
		 t.start();
		
		 //t.run(40);
			for(int i=0;i<10;i++) {
				System.out.println("main  class thread ......" +i);
			}
			
	}

}
class ThreadDemo extends Thread{
	public void  start() {
		 super.start();
			System.out.println("start method");
		
		
	}

	
	public void  run() {
		
			System.out.println("child  class thread .......");
		
		
	}
	public void  run(int n) {
		
			System.out.println("child  class thread with arrgument ......." +" ........"+n);
		
	}
}
