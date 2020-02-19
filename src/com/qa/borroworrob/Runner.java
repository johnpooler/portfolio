package com.qa.borroworrob;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println(palindrome("racecar"));
		System.out.println(palindrome("kayak"));
		System.out.println(palindrome("kaya"));
		System.out.println(palindrome("borrow or rob"));

	}

	public static boolean palindrome(String sentence) {

		String word = sentence.replace(" ", "").toLowerCase();

		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(word);
		stringBuilder.reverse();
		return word.equals(stringBuilder.toString());
		
		
		
//	String word = sentence.replace(" ", "").toLowerCase();
//	 int n = word.length();
//	 String reverse = "";
//     for(int i = n - 1; i >= 0; i--){
//    	 reverse = reverse + word.charAt(i);
//     }
//     return word.equals(reverse);

//     if(sentence.equalsIgnoreCase(reverse)){
//         System.out.println("The string is palindrome.");
//         return true;
//         }
//     
//     else {
//         System.out.println("The string is not palindrome.");
//         return false;
//         }

	}

}
