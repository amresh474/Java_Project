package com.merck.learning;

import java.util.Scanner;

public class FindDuplicateCharacterswithoutCollection {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter Any text ");
		String word = sr.nextLine();
		FindDuplicateCharacters(word);

	}

	public static void FindDuplicateCharacters(String word) {
		int count = 0;
		char[] charArray = word.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					count++;

				}

			}
			if (count != 0) {
				System.out.println(word.charAt(i) + "Occured " + count + "times");
			}

		}

	}

}
