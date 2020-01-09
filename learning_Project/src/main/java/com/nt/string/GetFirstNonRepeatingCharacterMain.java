package com.nt.string;

import java.util.HashMap;
import java.util.Set;

public class GetFirstNonRepeatingCharacterMain {

	public static void main(String[] args) {
		getNonReaptingCharacter("aaaaqsdfysdfsdfv");
	}

	public static void getNonReaptingCharacter(String str) {
		char[] str1 = str.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		for (char c : str1) {
			hashMap.put(c, hashMap.containsKey(c) ? hashMap.get(c) + 1 : 1);
		}

//		for (char c : str1) {
//			if (hashMap.containsKey(c)) {
//				hashMap.put(c, hashMap.get(c) + 1);
//
//			} else {
//				hashMap.put(c, 1);
//			}
//
//		}
		
		Set<Character> keys = hashMap.keySet();
		for (Character character : keys) {
			if (hashMap.get(character) == 1) {
				System.out.println(character + " is " + hashMap.keySet());
			}

		}
		hashMap.forEach((key, value) -> {
			if (value == 1) {
				System.out.println(key + " " + value);
			}
		});

	}
}
