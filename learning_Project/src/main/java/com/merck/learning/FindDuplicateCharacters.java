package com.merck.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateCharacters {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("enter any string  ");
		String text = sr.nextLine();
		printFindDuplicateCharacters(text);
	}

	public static void printFindDuplicateCharacters(String word) {
		char[] characters = word.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character c : characters) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> enterset = charMap.entrySet();
		System.out.println("========================================================");
		for (Map.Entry<Character, Integer> entry : enterset) {
			if (entry.getValue() > 1) {
				System.out.println(" %S: " +entry.getKey()+"%n"+entry.getValue());
			}
		}
	}

}
