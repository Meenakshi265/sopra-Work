package com.durga;

public class Parent  extends GrantParent{
	public static void main(String[] args) {
		System.out.println();
		GrantParent p= new Parent();
		p.show();
	}
	 static void show() {
		System.out.println("hello this is  parent show method 2....");
	}

}

class GrantParent{
   static void show() {
		System.out.println("hello this is grant  parent show method 1 ....");
	}
}