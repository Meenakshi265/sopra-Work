package program1;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
	   Scanner r = new Scanner(System.in);
	   int[] sub = new int[3];
	   int[][] marks = new int[3][3];
	   String[] name = new String[3];
	   String[] Subname = new String[3];
	   for(int i = 0 ;i<=3 ;i++) {
		   System.out.println("Enter the name of student:");
		   name[i]=r.nextLine();
					   
					   for(int k=0;k<=3;k++) {
					   
					   System.out.println("Enter marks of student: ");
					   marks[i][k]=r.nextInt();
				   }
	}   
		   
	   		   
	   for(int i = 0 ;i<=3 ;i++) {
		   System.out.println(" Student name" +name[i]);
		   System.out.println(" Subject name" +Subname[i]);
		   for(int j= 0;j<=3 ;j++) {
			   System.out.println( "marks name" +marks[i][j]);
		   }
	   }
	  

	}

}
