package com.nt.streamApi;

import java.util.Arrays;
/*
	Step 1:
	Arrays.stream(arr) – In this step we call the stream method on the Arrays class passing arr 
	as the parameter to the function this statement returns IntStream.
	Step 2:
	Arrays.stream(arr).sum() – Once we get the IntStream we can use different methods of the IntStream interface.
*/

public class GFG_Demo_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		System.out.println("Average using iteration ::  " + sum / arr.length);

		sum = Arrays.stream(arr).sum();
		System.out.println("Average using Streams ::" + sum / arr.length);
		System.out.println();
		System.out.println("Printing array elements : ");
		Arrays.stream(arr).forEach(s -> System.out.print(s + ","));
		System.out.println();
		System.out.println("Example of asDoubleStream(): ");
		Arrays.stream(arr).asDoubleStream().forEach(e -> System.out.print(e + " , "));
		System.out.println();
		System.out.println("\nExample of asLongStream");
		Arrays.stream(arr).asLongStream().forEach(e -> System.out.print(e + ","));
		System.out.println();
		System.out.println("\nExample of anyMatch");
		System.out.println(Arrays.stream(arr).anyMatch(e -> e % 11 == 0));
		System.out.println();
		System.out.println("Example of allMatch :");
		System.out.println(Arrays.stream(arr).allMatch(e -> e % 11 == 0));
		System.out.println();
		System.out.println("Example of noneMatch");
		System.out.println(Arrays.stream(arr).noneMatch(e -> e % 2 == 0));
		System.out.println();
		System.out.println(Arrays.stream(arr).reduce((x, y) -> x + y));

	}
}
