package com.nt.array;

public class longestSpanSum {

	/** Time Complexity : O(n2) */
	static int longestCommonSum(int arr1[], int arr2[]) {
		int maxLen = 0;

		for (int i = 0; i < arr2.length; i++) {
			int sum1 = 0, sum2 = 0;
			for (int j = i; j < arr2.length; j++) {
				sum1 += arr1[j];
				sum2 += arr2[j];
				if (sum1 == sum2) {
					int len = j - i + 1;
					if (len > maxLen) {
						maxLen = len;
					}
				}
			}

		}

		return maxLen;
	}

	public static void main(String[] args) {
		int arr1[] = new int[] { 0, 1, 0, 1, 1, 1, 1 };
		int arr2[] = new int[] { 1, 1, 1, 1, 1, 0, 1 };
		if (arr1.length != arr2.length) {
			System.out.println("The length of array is not Equal ");
			return;
		}
		System.out.println(longestCommonSum(arr1, arr2));
	}

}
