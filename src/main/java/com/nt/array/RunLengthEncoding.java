package com.nt.array;

/*

a) Pick the first character from source string.
b) Append the picked character to the destination string.
c) Count the number of subsequent occurrences of the picked character and append the count to destination string.
d) Pick the next character and repeat steps b) c) and d) if end of string is NOT reached.


*/
public class RunLengthEncoding {

	public static void printRLE(String str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {
			int count = 1;
			while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			System.out.print(str.charAt(i));
			System.out.print(count);
		}
	}

	public static void main(String[] args) {
		String str = "aaaaaaawwwwwwwwwwwwwwwuuuuuuuuuuuuuuuxxxvvn";
		printRLE(str);
	}

}
