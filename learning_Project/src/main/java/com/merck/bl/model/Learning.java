package com.merck.bl.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Learning {

	public static void main(String[] args) {
		inputArray();

	}

	private static int[] inputArray() {
		Scanner src = new Scanner(System.in);

		System.out.println("enter number of elements");

		int n = src.nextInt();

		int arr[] = new int[n];

		System.out.println("enter elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = src.nextInt();
		}

		return arr;
	}

}
