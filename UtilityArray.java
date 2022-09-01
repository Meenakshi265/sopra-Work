package Array;

import java.util.Arrays;
import java.util.Scanner;

public class UtilityArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  //  System.out.println(	UtilityArray .inputAndShowArray(2,2));
	  // UtilityArray .input1DArray(5);

	}
	 static int[][] inputAndShowArray(int row,int colum) {
		int n=row,m=colum;
        int firstArray[][]=new int[n][m];
       
        Scanner s =new Scanner(System.in);
        System.out.println("enter array elements :");
        for(int i=0;i<n;i++) {
       	   for(int j=0;j<n;j++) {
       		  firstArray[i][j]=s.nextInt();
       	   }
        }
       
        for(int i=0;i<n;i++) {
       	   for(int j=0;j<n;j++) {
                System.out.print( firstArray[i][j]+" ");
       	   }
       	   System.out.println("");
       	   
        }
        System.out.println(Arrays.deepToString(firstArray));  
        return firstArray;
        
	}
	
	 static int[][] arraySum(int[][] array1,int[][] array2) {
		 int[][] sumArray =new int[array1.length][array1.length];
			for(int i=0;i<array1.length;i++) {
				for(int j=0;j<array1.length;j++) {
				sumArray[i][j]=array1[i][j]+array2[i][j];
				}
			}
			for(int i=0;i<array1.length;i++) {
				for(int j=0;j<array1.length;j++) {
				System.out.print(sumArray[i][j]+" ");
				}
				System.out.println(" ");
			}
			return sumArray;
			
	 }
	 static int[][] multiplyArray(int[][] array1,int[][] array2) {
		 int[][] multiply=new int[array1.length][array1.length];
			for(int i=0;i<array1.length;i++) {
				for(int j=0;j<array1.length;j++) {
					for(int k=0;k<array1.length;k++) {
						multiply[i][j]+=array1[i][k]*array2[k][j];
					}
				}
			}
			for(int i=0;i<array1.length;i++) {
				for(int j=0;j<array1.length;j++) {
					
						System.out.print(multiply[i][j]+"    ");
				}
				System.out.println(" ");
			}
			return multiply;
		 
	 }
 public	  int[] input1DArray(int n){
		  int[] array=new int[n];
		  Scanner input=new Scanner(System.in);
		  System.out.println(" please enter array elements :");
			
		  for(int i=0;i<n;i++)
			 {
				  array[i]=input.nextInt(); 
			 }
			System.out.println(Arrays.toString(array));
			return array;
			 
	  }
	 static  int[] array1Dsort(int[] array1) {
		 int a[]=array1;
		  int temp=0;
          System.out.println("sorte4d  array is :");
          for(int i=0;i<array1.length;i++){
        	   for( int j=i+1;j<array1.length;j++) {
        		   if(array1[i]>array1[j]) {		  
        			   temp=array1[i];
        			   array1[i]=array1[j];
        			   array1[j]=temp;
        		   }
        			    
        	   }
          }
         
          for( int j=0;j<array1.length;j++) {
   		 
   			  System.out.print(array1[j]+"   ");
   			   
   		   }
          return array1;
	  }
	

}
