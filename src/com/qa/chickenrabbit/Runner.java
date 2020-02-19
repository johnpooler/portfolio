package com.qa.chickenrabbit;

public class Runner {

	public static void main(String[] args) {
		System.out.print(shikens(35,94));


	}
	public static boolean shikens(int heads, int legs) {
	for (int i = 1; i <= heads; i++) {
		for (int j = 1; j <= heads; j++) {
			if ((i + j) == heads && (i * 2 + j * 4) == legs) {
				System.out.println("There are " + i + " chickens and " + j + " rabbits.");
			}
		}
	}
	return true;
	}

}
