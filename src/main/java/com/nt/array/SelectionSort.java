package com.nt.array;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 2, 67, 9, 0, 4, 6, 5 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			int min_idx = i;
			for (int j = 0; j < ar.length; j++) {

				if (ar[j] > ar[min_idx]) {
					min_idx = j;
				}
				int temp = ar[min_idx];
				ar[min_idx] = ar[i];
				ar[i] = temp;
			}
		}

	}
}
