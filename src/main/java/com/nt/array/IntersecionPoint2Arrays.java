package com.nt.array;

import java.util.Arrays;

//Time complexity  O(n)
public class IntersecionPoint2Arrays {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 6, 8, 10 };
		int[] b = { 4, 5, 6, 11,1, 15, 20 };
//		Arrays.sort(a);
//		Arrays.sort(b);
		System.out.println("Intersection point is : " + intersection(a, b));

	}

	public static int intersection(int a[], int b[]) {
		int x = 0, y = 0, intersectionPoint = -1;
		while (x < a.length && y < b.length) {

			if (a[x] > b[y]) {
				y++;
			} else if (a[x] < b[y]) {
				x++;

			} else {
				intersectionPoint = a[x];
				return intersectionPoint;
			}

		}
		return intersectionPoint;
	}
}
