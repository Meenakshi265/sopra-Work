package program1;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str1="apple";
       String str2="banana";
       String str3="apple";
       str1=str2;
       if(str1.equals(str2))
    	   System.out.println("true");
       else
    	   System.out.println("false");
       if(str1==str2)
    	   System.out.println("true");
       else
    	   System.out.println("false");
       
	}

}
