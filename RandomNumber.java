package com.durga.wrapper;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=100;
		int min=10;
		for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() *min);
 
            // Output is different everytime this code is executed
            System.out.println(rand);
        }

	}

}
