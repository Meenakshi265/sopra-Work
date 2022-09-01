package com.durga;

public class HashCode {
  int roll=101;
	public HashCode(int roll) {
	this.roll = roll;
	
}
	public int hashCode() {
		return  roll;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashCode t1=new  HashCode(10);
		 HashCode t2=new  HashCode(100);
		 System.out.println(t1);
		 System.out.println(t2);
	}
	

}
