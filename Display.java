package com.durga.synchronizedc;

public class Display {
  public   synchronized void displayN() {
	  for(int i=0;i<10;i++) {
		  System.out.println("Number :"+i);
		  try {
			  Thread.sleep(1000);
		  } catch(InterruptedException e) {
			  System.out.println("exception:");
		  }
		  
	  }
  }
  public synchronized  void displayC() {
	  for(int i=65;i<=75;i++) {
		  System.out.println("char :"+ (char)i);
		  try {
			  Thread.sleep(1000);
		  } catch(InterruptedException e) {
			  System.out.println("exception:");
		  }
		  
	  }
  }
}
