package com.durga.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList l=new LinkedList();
       l.add("meenakshi");
       l.add("rakhi");
       l.add("sunita");
       l.add("bindu");
       System.out.println(l);
       ListIterator itr=l.listIterator();
       while(itr.hasNext()) {
    	   String st= (String)itr.next();
    	   System.out.println(st);
    	   if(st=="meenakshi")
    	   itr.remove();
    	   itr.add(st);
    	   
       }
       System.out.println(l);
	}

}
