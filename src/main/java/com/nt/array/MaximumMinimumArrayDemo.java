package com.nt.array;

import java.util.Arrays;

public class MaximumMinimumArrayDemo {

	public static void main(String[] args) {
		largestAndSmallest(new int[] { -20, 34, 21, -87, 92, Integer.MAX_VALUE });
		largestAndSmallest(new int[] { 1, -1, 0 });
	}

	public static void largestAndSmallest(int array[]) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;

		for (int number : array) {
			if (number > largest) {
				largest = number;
			} else if (number < smallest) {
				smallest = number;
			}
		}
		System.out.println("Largest number in array is : " + largest);
		System.out.println("Smallest number in array is : " + smallest);
		System.out.println("Difference Between  Lager and samallest " + (largest - smallest));
	}

}
