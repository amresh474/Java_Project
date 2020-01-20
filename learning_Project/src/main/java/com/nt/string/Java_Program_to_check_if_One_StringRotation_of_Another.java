package com.nt.string;

import java.util.Scanner;

/*

1) check length of two strings, if length is not same then return false
2) concatenate given string to itself
3) check if rotated version of String exists in this concatenated string
4) if yes, then second String is rotated version of first string

*/
public class Java_Program_to_check_if_One_StringRotation_of_Another {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter original String");
		String input = scnr.nextLine();

		System.out.println("Please enter rotation of String");
		String rotation = scnr.nextLine();
		if (checkRotatation(input, rotation)) {
			System.out.println(input + " and " + rotation + " are rotation of each other");
		} else {
			System.out.println("Sorry, they are not rotation of another");
		}
		scnr.close();
	}

	public static boolean checkRotatation(String original, String rotation) {
		if (original.length() != rotation.length()) {
			return false;
		}
		String concatenated = original + original;
		return concatenated.indexOf(rotation) != -1 ? true : false;
	}

}
