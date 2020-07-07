package com.nt.string;

public class StringReverseExample {
	public static void main(String[] args) {

		String str = "Sony is going to introduce Internet TV soon";
		System.out.println("Original String: " + str);

		System.out.println(reverseRecursively(str));
		System.out.println();
		int end = str.length();
//		System.out.println(reverseWithoutusing3rdvriable(str.toCharArray(), 0, end));
		System.out.println();
		System.out.println(reverse(str));
		System.out.println();
		System.out.println(new StringBuffer(str).reverse());

	}

	public static String reverseRecursively(String str) {
		if (str.length() < 2)
			return str;
		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}

	public static String reverse(String str) {
		String result = "";
		if (str == null && str.isEmpty()) {
			return str;
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

	public static String reverseWithoutusing3rdvriable(char[] str, int start, int end) {
		while (start < end) {
			str[start] ^= str[end];
			str[end] ^= str[start];
			str[start] ^= str[end];
			++start;
			--end;
		}
		return String.valueOf(str);

	}

}
