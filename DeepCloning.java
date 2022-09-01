package com.durga;

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		  cat co= new cat( 20);
		   Dog  d=new Dog(co,111);
		   Dog  d1=(Dog)d.clone();
		   d1.c.i=455;
		   System.out.println("d1=  "+ d1.c.i);
		   System.out.println("d=  "+ d.c.i);
		   
		   
	}

}



