package com.example.demo;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Solution {
	public static void main(String args[]) {
		String str = null;
		List<String> catgf = new ArrayList<>();
		List<String> catgc = new ArrayList<>();
		List<String> catgfb = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int numberOfDays = in.nextInt();
		for (int i = 0; i < numberOfDays; i++) {
			String ingredientId = in.next();
			if (ingredientId.startsWith("FAT")) {
				catgf.add(ingredientId);
			} else if (ingredientId.startsWith("FIBER")) {
				catgfb.add(ingredientId);
			} else {
				catgc.add(ingredientId);
			}

			List<String> probCat = null;
			if (catgf.size() >= 2) {
				probCat = catgf;
			}
			if (catgfb.size() >= 2) {
				probCat = catgfb;
			}
			if (catgc.size() >= 2) {
				probCat = catgc;
			}
			List<String> anotherCat = null;
			if (probCat != null && probCat.size() >= 2) {
				if (probCat != catgf && catgf.size() >= 1) {
					anotherCat = catgf;
				}
				if (probCat != catgfb && catgfb.size() >= 1) {
					anotherCat = catgfb;
				}
				if (probCat != catgc && catgc.size() >= 1) {
					anotherCat = catgc;
				}
				if (anotherCat != null) {
					anotherCat.remove(0);
					probCat.remove(0);
					probCat.remove(0);
					str = str + "1";

				} else if (probCat.size() > 2) {
					probCat.remove(0);
					probCat.remove(0);
					probCat.remove(0);
					str = str + "1";
				} else {
					str = str + "0";

				}
			}
			else
			{
				str = str + "0";
			}			
		}
		System.out.print(str);
	}
}