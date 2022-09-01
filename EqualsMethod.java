package com.durga;

import java.lang.reflect.Method;

public class EqualsMethod {
  String name;
  int roll;
	public EqualsMethod(String name, int roll) {
	this.name = name;
	this.roll = roll;
}
	public boolean equals(Object obj) {
		try{
		 String name1=this.name;
		  int roll_1=this.roll;
		  EqualsMethod s=(EqualsMethod)obj;
		  String name2=s.name;
		  int roll_2=s.roll;
		  if(name1.equals(name2)&& roll_1==roll_2)
		return true;
		  else
			  return false;
		}
		catch(ClassCastException e) {
			return false;
		}
		catch(NullPointerException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualsMethod n1=new EqualsMethod("rakshi",101);
		EqualsMethod n2=new EqualsMethod("rakshi",101);
    System.out.println(n1.equals(n2));
    System.out.println(n1.equals("meenakshi"));
    System.out.println(n1.equals(null));
     Class c=n1.getClass();
     System.out.println(c.getName());
     Method[] m=c.getDeclaredMethods();
     for(Method m1:m) {
    	 System.out.println(m1.getName()+".......");
     }
	}

}
