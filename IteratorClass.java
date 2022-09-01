package com.durga.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList L= new ArrayList();
		for(int i=1;i<=10;i++) {
			L.add(i);
		}
       Iterator  itr=L.iterator();
       while(itr.hasNext()) {
			Integer I=(Integer)itr.next();
			//System.out.println("I="+I);
			if(I%2==0) {
				System.out.println(I+"  even...");
			}
			else {
				System.out.println(I+" will be remove");
				itr.remove();
			}
	
	}
       System.out.println(L);

	}
}
