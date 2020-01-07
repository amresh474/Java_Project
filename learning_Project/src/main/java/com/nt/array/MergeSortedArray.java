package com.nt.array;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] input1 = { 2, 3, 4, 5, 6 };
		int[] input2 = { 1, 4, 9, 89, 99 };
		int m = input1.length;
		int n = input2.length;
		merge1(input1, m, input2, n);

	}

	public static void merge1(int A[], int m, int B[], int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		int[] mrgArr = new int[k];
		while (k > 0) {
			System.out.println("---" + k + "====");
			if (j > 0 || (i >= 0 && A[i] > B[j])) {
				System.out.println("*****" + k + "=====" + i);
				mrgArr[k--] = A[i--];
				System.out.println("*****" + k + "=====" + i);
			}

			else {
				mrgArr[k--] = B[j--];
				System.out.println("*****" + k + "=====" + j);
			}

		}
	}

}
