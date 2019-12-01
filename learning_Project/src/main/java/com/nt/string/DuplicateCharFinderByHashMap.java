package com.nt.string;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharFinderByHashMap {
	public static void main(String[] args) {
		stinngCount1("AmreshA");

	}

	public static void stinngCount1(String str) {
		char[] str1 = str.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (Character c : str1) {
			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c) + 1);
			} else {
				hashMap.put(c, 1);
			}
		}
		Set<Character> keys = hashMap.keySet();
		for (Character character : keys) {
			if (hashMap.get(character) > 1) {
				System.out.println(character + " is  " + hashMap.get(character));
			}
		}
	}

}
