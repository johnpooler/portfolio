package com.qa.charlocation;


public class Runner {

	public static boolean find1(String s, int i, char c) {

		// find ("hello", 2, 'e')->> True
		// find ("trash", 4, 'a')->> False
		// find ("trash", 4, 's')->> True
		return (s.charAt(i - 1) == c); 
			
}
		
	
	
	public static void main(String[] args) {
			
			
			System.out.println(find1("hello", 2, 'e'));
			System.out.println(find1("trash", 4, 'a'));
			System.out.println(find1("trash", 4, 's'));
			
			

		}
}