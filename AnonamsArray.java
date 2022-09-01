package Array;

public class AnonamsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AnonamsArray.sum(new int[][] {{50,40},{10,20,30}});
	}
    static  void  sum(int[][] arr) {
    	  int total =0;
    	 for(int i[]: arr)
    		 for(int ii:i)
    		  total=total+ii;
     
  	System.out.println(total);
     }
}
