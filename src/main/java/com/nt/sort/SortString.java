package com.nt.sort;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortString {
	public static void main(String[] args) {
		String randomString = "adcbgekhs";

		String sortedChars = Stream.of(randomString.split("")).sorted().collect(Collectors.joining());

		System.out.println("StreamApi ...." + sortedChars);

		// Convert string to char array
		char[] chars = randomString.toCharArray();
		// short char Array
		Arrays.sort(chars);
		// Convert char array to string
		String sortedString = String.valueOf(chars);
		System.out.println("char Array ............" + sortedChars);
	}

}
