package program1;
import java.util.Scanner;
public class Array_size {

	public static void main(String[] args) {
		//int[] arr= new int[n];
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of the aray");
		int n=s.nextInt();
		int[] arr= new int[n];
		System.out.println("enter the size of the aaray");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
