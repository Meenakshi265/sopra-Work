package com.durga.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EmumerationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Integer I=(Integer)e.nextElement();
			//System.out.println("I="+I);
			if(I%2==0) {
				System.out.println(I+"  even...");
			}
//			else {   eNUMERATION  DOSE NOT HAVE REMOVE METHOD......
//				I.remove();
//			}
			
		}
		System.out.println(v);

	}

}
