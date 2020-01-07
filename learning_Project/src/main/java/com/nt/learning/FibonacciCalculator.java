package com.nt.learning;

import java.util.Scanner;

public class FibonacciCalculator {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter Any number     ");
		int num1 = sr.nextInt();
		int t1 = 0, t2 = 1, nextterm = 0;
		for (int i = 0; i < num1; i++) {
			System.out.print(" " + t1+",");

			nextterm = t1 + t2;
			t1 = t2;
			t2 = nextterm;

		}

	}

}
