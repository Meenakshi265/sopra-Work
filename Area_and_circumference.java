package program1;
import java.util.Scanner;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
public class Area_and_circumference {

	public static void main(String[] args) {
		System.out.println("Enter the  circle radius:");
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
JOptionPane.showMessageDialog(null,	"Area of the circle :"+ Area_and_circumference.area(r));
		// TODO Auto-generated method stub

	}
	 static double  area(double r) {
		 double result=(Math.PI*r*r);
		 return result;
	}
	 static double circumference(double r) {
		 double result=(2*Math.PI*r);
		 return result;
	}

}
