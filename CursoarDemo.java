package com.durga.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursoarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		System.out.println(v.getClass().getName());
		Enumeration e=v.elements();
		System.out.println(e.getClass().getName());
		 ListIterator itr=v.listIterator();
		 System.out.println(itr.getClass().getName());
		 Iterator  itr2=v.iterator();
			System.out.println(itr2.getClass().getName());
	}

}
