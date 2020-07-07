package com.nt.learning;

import java.util.Scanner;
import java.util.regex.Pattern;

public class reverse_words_in_String {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println(" ENter Any sentence ");
		String str = src.nextLine();
		System.out.println("    " + reversWord(str));
	}

	public static String reversWord(String str) {
//		Pattern pattern = Pattern.compile("\\s");
		String[] splitstr = str.split(" ");
		String Result = " ";
		int t=splitstr.length;
		for (int i = 0; i < splitstr.length; i++) {
			if (i == splitstr.length - 1) {
				Result = splitstr[i]+ Result;
			} else {
				Result =" "+splitstr[i] + Result;
			}
		}
		return Result;
	}

}
