package com.nt.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

import com.nt.date.NumberToCurrencyExamples;

public class _Function {
	public static void main(String[] args) {
		int increment = incrementByOne(1);
		System.out.println(increment);
		int increment1 = incrementByOneFunction.apply(1);
		System.out.println(increment1);

		System.out.println(multipleby10.apply(27));

		System.out.println(addByOneandThenMultipleby10.apply(21));

		System.out.println("//Bifunction ");
		System.out.println(incrementByOneandMultipleBy10(4, 6));
		System.out.println("--------    -----------");
		System.out.println(incrementByOneandMultipleByBifunction.apply(4,8));
	}

	static Function<Integer, Integer> incrementByOneFunction = number -> number + 10;

	static Function<Integer, Integer> multipleby10 = number -> number * 10;

	static Function<Integer, Integer> addByOneandThenMultipleby10 = incrementByOneFunction.andThen(multipleby10);

	public static int incrementByOne(int number) {
		return number + 1;
	}

	// BiFunction
	public static BiFunction<Integer, Integer, Integer> incrementByOneandMultipleByBifunction = (NumberToIncrementByOne,
			numberToMultipleBy10) -> (NumberToIncrementByOne + 1) * numberToMultipleBy10;

	public static int incrementByOneandMultipleBy10(int number, int numtomultiple) {
		return (number + 12) * numtomultiple;
	}
}
