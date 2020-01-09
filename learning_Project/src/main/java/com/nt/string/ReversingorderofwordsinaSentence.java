package com.nt.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingorderofwordsinaSentence {
	public static void main(String[] args) {
		System.out.println("this is amresh kumar");
		System.out.println(reverseWords("this is amresh kumar"));
		System.out.println();
		System.out.println("this is good boy");
		System.out.println(reverseString("this is good boy"));
	}

	public static String reverseWords(String sentence) {
		if (sentence.trim().isEmpty()) {
			return sentence;
		}
		StringBuilder stringBuilder = new StringBuilder();
		List<String> words = Arrays.asList(sentence.split("\\s"));
		Collections.reverse(words);
		for (String string : words) {
			stringBuilder.append(string);
			stringBuilder.append(' ');
		}
		return stringBuilder.toString().trim();
	}

	public static String reverseString(String line) {
		if (line.trim().isEmpty()) {
			return line;
		}
		StringBuilder str = new StringBuilder();
		String[] character = line.trim().split("\\s");

		for (int i = character.length - 1; i >= 0; i--) {
			str.append(character[i]);
			str.append(' ');
		}
		return str.toString().trim();
	}

}
