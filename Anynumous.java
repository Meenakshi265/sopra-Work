package Rakhi;

public class Anynumous {
		
public static void main(String[] args) {
	int  n=10000;
	int  r=0;
	int d=0;
	if(n<=999) {
		System.out.println(n);
	}
	else if( n<=99999) {
		r=n%1000;
		d=n/1000;
		System.out.println(d+","+r);
	}
	else 
		System.out.println("djhgfjhes");
}


}