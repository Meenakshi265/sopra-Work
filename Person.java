package com.durga;

public class Person {
	String name;
	int age;
	Person(){
		this.name="meenakshi";
		this.age=20;
		System.out.println(" person constructor :");
		
	}
	

}
class Student extends Person{
	int roll;
	int marks;
	Student(String name, int age, int roll,int marks){
		this.name=name;
		this.age=age;
		this.roll=roll;
		this.marks=marks;
		
	}
	public static void main(String[] args) {
		Student  stu=new Student ("meena",10,101,98);
		System.out.println(stu.name);
		System.out.println(stu.age);
		System.out.println(stu.roll);
		System.out.println(stu.marks);
		
	}
}
