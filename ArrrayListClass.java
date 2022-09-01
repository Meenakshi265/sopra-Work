package com.durga.collection;

import java.util.ArrayList;

public class ArrrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList l=new ArrayList();
       for(int i=0; i<=10;i++) {
    	   l.add(i);
       }
       System.out.println(l);
       l.add(0, 15);
       System.out.println(l);
       l.add(2);
       System.out.println(l);
       l.addAll(5,l);
       System.out.println(l);

       System.out.println(l);
       l.ensureCapacity(10);
       System.out.println(l.get(3));
        l.clear();
        System.out.println(l.isEmpty());
	}

}
