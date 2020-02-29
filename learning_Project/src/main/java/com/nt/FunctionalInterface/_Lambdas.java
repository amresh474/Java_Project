package com.nt.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Lambdas {
	public static void main(String[] args) {
		
		String result = upperCaseNames.apply("amresh kumar", 25);
		
		System.out.println(result);

		System.out.println(upperCaseNames.apply("kumar Mohan ", 34));
	}
	
	public static Function<String, String> upperCase = name -> name.toUpperCase();
	
	

	public static Function<String, String> lowerCase = String::toLowerCase;
	
	

	public static Function<String, String> upperCaseName = name -> {
		// Logic
		if (name.isBlank())
			throw new IllegalArgumentException("");
		return name.toUpperCase();
	};
	
	public static BiFunction<String, Integer, String> upperCaseNames = (name, age) -> {
		// Logic
		if (name.isBlank())
			throw new IllegalArgumentException("");
		System.out.println(age);
		return name.toUpperCase();
	};
}
