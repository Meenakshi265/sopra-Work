package com.chapter7;

import java.util.Arrays;

public class ArrayMerging {

	int [] list1= {10,20,30};
	int [] list2= {45,35,25,15};
	int [] list3= new  int[list1.length+list2.length];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMerging obj=new ArrayMerging ();
		//System.out.println(list3.length);
		System.out.println(" sorted array is :"+Arrays.toString(obj.merge()));

	}
   
	int[] merge() {
		int i=0;
		int j=3;
		System.out.println(list3.length);
		for(int k=0;k<(list3.length);k++) {
			if(i<list1.length) {
			if(list1[i]<list2[j]) {
				list3[k]=list1[i];
				i++;
			//	System.out.println(list3[k]);
				//System.out.println("i="+i);
			}
			else {
				list3[k]=list2[j];
				j--;
			//	System.out.println(list3[k]);
				//System.out.println("j= "+j);
			}
			}
			if(j==0 && i<list1.length) {
				list3[k]=list1[i];
				i++;
				//System.out.println("iii="+i);
			}
			if(j>=0 && i>=list1.length) {
				list3[k]=list2[j];
				//System.out.println(list3[k]);
				j--;
				//System.out.println("jjj="+j);
			}
			
		}
		return list3;
	}
	}
	   
