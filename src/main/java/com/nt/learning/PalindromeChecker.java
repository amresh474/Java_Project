package com.nt.learning;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter Any string ");
		String reversString = sr.nextLine();
		System.out.println(reverse(reversString));
		String reversedString = reverse(reversString);
		if (reversedString.equals(reversString)) {
			System.out.println(reversString + "    is palindrome string ");

		} else {
			System.out.println(reversString + "    is not palindrome String ");
		}

	}

	/*
	 * public static boolean isPalindrome(String input) { if (input == null) {
	 * return false; } String reversed = reverse(input);
	 * 
	 * return input.equals(reversed); }
	 */

	public static String reverse(String text) {
		if (text==null || text.isEmpty()) {
			return text;
		}
		String str = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			str = str + text.charAt(i);
		}

		return str;

	}

	/*
	 * @Test public void testPalindromeRecursive() {
	 * assertTrue(isPalindrome("madam")); assertFalse(isPalindrome("programming"));
	 * assertTrue(isPalindrome("")); assertTrue(isPalindrome("AIA")); }
	 * 
	 * @Test public void testPalindrome() { assertFalse(isPalindrome("wonder"));
	 * assertFalse(isPalindrome("cat")); assertTrue(isPalindrome("aaa"));
	 * assertTrue(isPalindrome("BOB")); }
	 */

}
