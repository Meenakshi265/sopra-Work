package com.durga.collection;

import java.io.IOException;

class Parent{
	  public Parent() throws IOException, InterruptedException{
		
		System.out.println("Parent");
	
	}

	
}
class Child extends Parent{
	 public Child() throws Exception{
		
		System.out.println("Child");
		
	}
	
}

public class Throwss {
	
		public static void main(String[] args)  {
			System.out.println("start");
			try {
				Parent p =new Child();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	}
}
