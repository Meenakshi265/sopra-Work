package com.durga;
 class Outer{
	 public void taste() {
		 System.out.println("salty");
	 }
 }


public class AnonamysInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer p1= new Outer() {
			public void taste() {
				 System.out.println("sweet");
			 }
		};
		p1.taste();
		Outer p= new Outer();
		p.taste();
		Outer p2= new Outer() {
			public void taste() {
				 System.out.println("sweet");
			 }
			
		};
		p2.taste();
		System.out.println(p1.getClass().getName());
		System.out.println(p.getClass().getName());
		System.out.println(p2.getClass().getName());
		

	}

}
