package Array;
import java.util.Scanner;

public class MultiplyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter row of the array");
		int row=input.nextInt();
		System.out.println("Enter col of the array");
		int colum=input.nextInt();
		int[][] array1=UtilityArray.inputAndShowArray(row,colum);
		int[][] array2=UtilityArray.inputAndShowArray(row,colum);
		System.out.println("Enter  multiply of the array :");
		int[][] multiply=UtilityArray.multiplyArray( array1,array2);
	}

}
