package pk;

import java.util.Scanner;

public class Arraysum {
public static void main(String[] args) {
	int length;
	int sum=0;
	Scanner s= new Scanner(System.in);
	System.out.println("enter the length of array");
	length=s.nextInt();
	int num[] =new int[length];
	
	for(int i=0;i<length;i++) {
		
		System.out.print("enter the elements");
		  num[i]=s.nextInt();
	
	}
}
static	  void sum(int x[]) {
	  int total=0;
	  for(int i=0;i<10;i++)
		  total+=i;
	   System.out.println(total);	   
}
}
