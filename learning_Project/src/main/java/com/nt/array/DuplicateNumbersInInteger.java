package com.nt.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Time complexity  O(n)

public class DuplicateNumbersInInteger {

	public static void main(String[] args) {
		int[] input1 = { 2, 3, 4, 5, 3, 4, 5, 6 };
		dublicate(input1);
	}

	public static void dublicate(int arr[]) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (set.add(arr[i]) == false) {
				System.out.print("Duplicate Number in Array     " + arr[i]);
			}

		}
		Iterator<Integer> tr = set.iterator();
		Integer sum = 0;
		while (tr.hasNext()) {
			Integer number = tr.next();
			sum += number;
		}
		System.out.println(set);
		System.out.println(sum);

	}
}
