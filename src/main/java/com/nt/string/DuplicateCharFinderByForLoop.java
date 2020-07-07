package com.nt.string;

public class DuplicateCharFinderByForLoop {
	public static void main(String[] args) {
		stinngCount("amreshkumar");
	}

	public static void stinngCount(String str) {
		int count = 1;
		char[] Str1 = str.toCharArray();
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j < Str1.length; j++) {
				if (Str1[i] == Str1[j]) {
					count++;
					System.out.println(Str1[i] + "    " + count);
				}
			}

		}
	}
}
