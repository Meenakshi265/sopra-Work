package program1;

import java.util.Scanner;

public class Stu {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		String[] name = new String[3];
		String[] subname = new String[3];
		int [] marks = new int[3];
		
		for(int i = 0; i<3 ; i++) {
			System.out.println("Enter the student name:");
			name[i] = r.nextLine();
			for(int j =0 ;j<3 ;j++) {
				System.out.println("Enter the suject name");
		    	subname[j] = r.nextLine();
				{
					for(int k =0; k<3 ;k++) {
						System.out.println("Enter the marks of subject");
						marks[i] = r.nextInt();
					}
				}
			}
		}	
	 }
 }


