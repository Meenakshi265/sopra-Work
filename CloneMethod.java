package com.durga;

public class CloneMethod implements Cloneable{
	 String name="meenakshi";
	int age= 5;
 CloneClass city;

	@Override
	public String toString() {
		return "CloneMethod [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		 CloneClass c=new  CloneClass("pppp");
		CloneMethod  obj=new CloneMethod();
		CloneMethod  obj1= (CloneMethod)obj.clone();// SHALLOW CLONING 
		obj1.name="rakhi";
		obj1.age=20;
		//obj1.CloneClass.city="hhhhh";		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj.name);
	//	System.out.println(obj1.CloneClass.city);
	}

}
