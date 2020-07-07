package com.nt.string;

public class HowfindnumberofwordsString {
	public static void main(String[] args) {
		String str = "In order to implement this method we need to assume that two words are separated by space."
				+ " We also need to ignore leading, trailing and multiple spaces between words. One way to solve "
				+ "this problem is  to split String by space and then count number of parts. "
				+ "We will see two solution of this problem, here is the first one";
		System.out.println(WordCounterProblem(str));
	}

	public static int WordCounterProblem(String word) {
		if (word == null && word.isEmpty()) {
			return 0;
		}
		String input = word.trim();
		int count = input.isEmpty() ? 0 : input.split("\\s+").length;
		return count;

	}
}
