package Array;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class SortingArray {

	public static void main(String[] args) {
		
				Scanner input=new Scanner(System.in);
				System.out.println("Enter   number the array");
				int n=input.nextInt();
				 UtilityArray s=new UtilityArray();
			int[] array1= s.input1DArray(n);
			System.out.println(Arrays.toString(array1));
		int[] sortedArray=UtilityArray.array1Dsort(array1);
				

	}

}
