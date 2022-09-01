package Array;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter row of the array");
		int row=input.nextInt();
		System.out.println("Enter col of the array");
		int colum=input.nextInt();
		if(row==colum) {
		int[][] array1=UtilityArray.inputAndShowArray(row,colum);
		int[][] array2=UtilityArray.inputAndShowArray(row,colum);
		System.out.println("Enter sum of the array is :");
		int [][] arraySum=UtilityArray.arraySum(array1,array2);	
		}
		else
			System.out.println("row and colum are not equal :");
	}
	

}
