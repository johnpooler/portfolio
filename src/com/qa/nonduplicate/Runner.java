package com.qa.nonduplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		System.out.println(unique("John Pooler"));

	}

	public static String unique(String sentence) {
		
		return Arrays.asList(sentence.split("")).stream().distinct().collect(Collectors.joining(""));



//		List<Character> listy = new ArrayList<>();
//		String uniqueLetters = "";
//		for (int i = 0; i < sentence.length(); i++) {
//			if (!listy.contains(sentence.charAt(i))) {
//				listy.add(sentence.charAt(i));
//			}
//		}
//		for (char c : listy) {
//			uniqueLetters = uniqueLetters+c;
//
//		}
//
//		return uniqueLetters;

	}

}
