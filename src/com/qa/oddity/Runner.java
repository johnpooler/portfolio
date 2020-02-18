package com.qa.oddity;

import java.util.List;
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		Runner odd = new Runner();
		int[] nums = new int[] { 9, 21, 6, 3, 4, 10, 11, 971, 22 };
		System.out.println(odd.oddity(nums));

	}

	public List<Integer> oddity(int[] nums) {

		List<Integer> odds = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				odds.add(nums[i]);
			}
		}
		return odds;

	}

}
