package com.durga.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		System.out.println(l);
	     ListIterator itr=l.listIterator();
	  while(itr.hasNext()) {
		 String I=(String)itr.next();
		
		  System.out.println(I);
		  System.out.println("HIIII...........");
		  //System.out.println(I1+"....1");
		 
	  }

	}

}
