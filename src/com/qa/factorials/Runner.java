package com.qa.factorials;


public class Runner {
	public static void main(String[] args) {
		System.out.println("The factorial of 4 is: "+factorials(4));
		System.out.println("The factorial of 5 is: "+factorials(5));
	}
	public static int factorials(int i) {
		int number = 1;
		while(i>0) {
			number *=i;
			i--;
		}
		return number;
	}
}