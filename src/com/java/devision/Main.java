package com.java.devision;

public class Main {
	
	// Number 904. How many times is divided by 3.
	public static void main(String [] str){
		int count = 0;
		int number = 0;
		System.out.print("Numbers are: ");
		for(int index = 0; index < 905; index++) {
			number++;
			if(number % 3 == 0) {
				count++;
				System.out.print(number + "; ");
			}
		}
		System.out.println("\nAmount of timems from 0 till 904 are met numbers that can be divided by "
				+ "number 3 is " + count);
	}

}
