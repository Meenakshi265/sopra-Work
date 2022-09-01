package program1;

public class Patten1 {
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
		for(int j=0;j<=4-i;j++)
		{
			System.out.print(" * ");
		}
		for(int k=1;k<=(2*i)-1;k++)
		{
			System.out.println(" ");
		}
    }
	}

}
