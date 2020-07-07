package com.nt.array;

import java.util.Arrays;

public class twoArrayMeragesort2 {

	public static void main(String[] args) {
		int arr1[] = { 45, 67, -1, 89, 78, 67 };
		int arr2[] = { 67, 78, 90, 67, 45, 6 };
		System.out.println(Arrays.toString(merge(arr1, arr2)));

	}

	private static int[] merge(int[] first, int[] second) {
		int sum = (first.length + second.length);
		int[] result = new int[sum];
		int iFirst = 0;
		int iSecond = 0;
		int j = 0;

		while (iFirst < first.length && iSecond < second.length) {
			if (first[iFirst] < second[iSecond]) {
				result[j] = first[iFirst];
				iFirst++;
			} else {
				result[j] = second[iSecond];
				iSecond++;
			}
			j++;
		}
		System.out.println(iFirst + "  " + iSecond);
		while (iFirst < first.length) {
			result[j] = first[iFirst];
			iFirst++;
			j++;

		}
		while (iSecond < second.length) {
			result[j] = second[iSecond];
			iSecond++;
			j++;

		}
		System.out.println(iFirst + " - " + iSecond);
		return result;
	}
}
