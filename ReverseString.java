package program1;

public class ReverseString {
	//
	

	public static void main(String[] args) {
		String str="meenakshi";
		String temp="";
	
	for( int i=str.length()-1;i>=0;i--)
     	{
		  char ch=str.charAt(i);
		  temp=temp+ch;
	      }
	System.out.println(temp);
		// TODO Auto-generated method stub

	}

}
