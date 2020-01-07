package com.nt.learning;

public class multipleof3and5 {
	public static void main(String[] args) {
		System.out.println(maxSubstring("aaa"));
	}

	public static String maxSubstring(String s) {
		String res = "";
		int j = s.length();
		// Write your code here
//		for (int i = 0; i < s.length(); i++) {
		for (j=j - 2; j < 1; j--) {

			res = s.substring(j);
			System.out.println(res);
		}
		return s;
	}

}
