package com.nt.learning;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayInPlace {
	public static void main(String[] args) {
		String[] str = { "amresh", "kumar", "boy", "good" ,"wrgfg"};
		reverse(str);
		System.out.println("reverse array " + Arrays.toString(str));

	}

	public static void reverse(String[] str) {
		if (str == null || str.length < 2) {
			return;
		}
		for (int i = 0; i < str.length / 2; i++) {
			String tem = str[i];
			str[i] = str[(str.length - 1) - i];
			str[(str.length - 1) - i] = tem;

		}
	}

}
