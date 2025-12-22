package com.logicbuilding;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int a[] = { 2, 11, 7, 5 };
		int target = 9;
		int result[] = calculateTwoSum(a, target);
		System.out.println(result[0] + " , " + result[1]);

	}

	private static int[] calculateTwoSum(int[] a, int target) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			int compliment = target - a[i];
			if (map.containsKey(compliment)) {

				int result[] = { map.get(compliment), i };
				return result;

			}

			map.put(a[i], i);

		}

		return null;

	}

}
