package com.durga;

import java.util.Arrays;
import java.util.Scanner;
import Array.UtilityArray;

public class ArrayMerrg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMerrg obj=new ArrayMerrg ();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of 1st array");
        int n=scan.nextInt();
        UtilityArray s=new UtilityArray();
		int[] list11= s.input1DArray(n);
		System.out.println("enter the size of 2nd array :");
		int m=scan.nextInt();
		int[] list22= s.input1DArray(m);
			System.out.println(Arrays.toString(obj.merge(list11,list22)));
	}
	int[] merge(int[] list1,int[] list2) {
		int i=0;
		int j=list2.length-1;
		int k=0;
		int [] list3= new  int[list1.length+list2.length];
		System.out.println(list3.length);
			while(i<list1.length||j>=0) {
				if(j>=0&&i<list1.length) {
				if(list1[i]<list2[j]){
					list3[k]=list1[i];
					i++;
				}
				else {	
				list3[k]=list2[j];
					j--;
					}
				
				}
				if(j<0 &&i<list1.length) {
					list3[k]=list1[i];
					
					i++;
				}
				if(j>=0 && i>=list1.length) {
					list3[k]=list2[j];	
					
					j--;
				}
				k++;
			}
		
		return list3;
}
}