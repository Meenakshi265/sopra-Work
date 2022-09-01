package Array;

import java.util.Scanner;

public class Declaration {
	static 	 int c[]= {1,2};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	int [] []a,b[];
//	int [][]d=new int[3][];
//	d[0]=new int[3];
//	d[1]=new int[5];
//	d[2]=new int[5];
//	int[][] d_2= {{1,2,3},{5,6}};
////	int d[][]= {{1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
//	System.out.println(d_2);
//     System.out.println(d_2[0]);
//     System.out.println(d_2.length);
//     System.out.println(d_2[0].length);
		int count=0;
		System.out.println("enter the valu of array");
     Scanner sc=new Scanner(System.in);
     int[][][] d3=new int[2][2][2];
    for(int i=0; i<d3.length;i++) {
    	  for(int j=0; j<d3[0].length;j++) {
    		  for(int k=0; k<d3[0][0].length;k++) {
    	        d3[i][j][k]=sc.nextInt();  		  
    		  }
    	  }
    }
    for(int i=0; i<d3.length;i++) {
  	  for(int j=0; j<d3[0].length;j++) {
  		  for(int k=0; k<d3[0][0].length;k++) {
  			  count++;
  	        System.out.print(d3[i][j][k]+" ");		  
  		  }
  		  System.out.println("   ");
  	  }
  	  System.out.println("    ");
  }
     
     System.out.println(count);
     
	}
	
}
