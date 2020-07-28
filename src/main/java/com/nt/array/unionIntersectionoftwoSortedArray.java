package com.nt.array;

import java.util.Arrays;
import java.util.HashSet;

public class unionIntersectionoftwoSortedArray {

	private static void union(int arr1[], int arr2[]) {
		int n = arr1.length, m = arr2.length;
		int i = 0, j = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j])
				System.out.print(arr1[i++] + " ");
			else if (arr2[j] < arr1[i])
				System.out.print(arr2[j++] + " ");
			else {
				System.out.print(arr2[j++] + " ");
				i++;
			}
		}
		while (i < n) {
			System.out.println(arr1[i++]);
		}
		while (j < m) {
			System.out.println(arr2[j++]);
		}
	}

	private static HashSet<Integer> unionMethod(Integer arr1[], Integer arr2[]) {
		HashSet<Integer> set = new HashSet<>();
		set.addAll(Arrays.asList(arr1));
		set.addAll(Arrays.asList(arr2));
		return set;
	}

	private static int[] intersection(int nums1[], int nums2[]) {
		HashSet<Integer> set1 = new HashSet<>();
		for (Integer integer : nums1) {
			set1.add(integer);
		}

		HashSet<Integer> set2 = new HashSet<>();

		for (Integer integer : nums2) {
			if (set1.contains(integer)) {
				set2.add(integer);
			}
		}
		int[] result = new int[set2.size()];
		int i = 0;
		for (int n : set2) {
			System.out.print(n + " ");
			result[i++] = n;
		}
		return result;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 4, 5, 6 };
		int arr2[] = { 2, 3, 5, 7 };

		union(arr1, arr2);
		System.out.println("=============  intersection ===========");
		intersection(arr1, arr2);

		Integer nums1[] = { 1, 2, 4, 5, 6 };
		Integer nums2[] = { 2, 3, 5, 7 };
		System.out.println();
		System.out.println(unionMethod(nums1, nums2));
	}

}
