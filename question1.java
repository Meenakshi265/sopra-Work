import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<Student> stuList = new ArrayList();
		
		int numberOfStudent = 4;
		System.out.println("Enter Students Details");
		for(int i = 0; i < numberOfStudent; i++) {
			System.out.printf("Enter details of %d student\n",i+1);
			Student stu = new Student();
			System.out.println("Enter Name");
			stu.name = sc.next();
			System.out.println("Enter computer marks");
			stu.com = sc.nextInt();
			System.out.println("Enter math marks");
			stu.math = sc.nextInt();
			System.out.println("Enter english marks");
			stu.english = sc.nextInt();
			stuList.add(stu);
		}
		
		int maxCom = 0;
		String name = " ";
		int maxMath=0;
		int maxEnglish=0;
		int total=0;
		int topper=0;
		String topperName="";  
		for(int i = 0; i< numberOfStudent; i++) {
			int temp = stuList.get(i).com;
			if(temp > maxCom) {
				maxCom = temp;
				name = stuList.get(i).name;
			
			}
			
		}
		for(int i=0;i<numberOfStudent;i++) {
			total =stuList.get(i).math+stuList.get(i).com+stuList.get(i).english;
			if(topper<total) {
				topper=total;
                topperName=stuList.get(i).name;				
			}
			
		}
		
		System.out.println("Max marks in Computer" + maxCom);
		System.out.println("Student name is:" + name);
		System.out.println("Class topper is :"+topperName +" tytuiujmarks :"+topper);
		
		
	}
}

