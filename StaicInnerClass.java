public class StaicInnerClass {
	int n=4;
	static int m=4;
	 static class Nested{
		 int p=10;
		 static int k=0;
		 static void m1() {
                           
			 System.out.println(" static method :."+k);
		 }
		 public static void main(String[] args) {
			 Nested.m1();
			 System.out.println("calling by staic class main method :");
		}
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Nested s=new Nested();
    Nested.m1();
  
	}

}