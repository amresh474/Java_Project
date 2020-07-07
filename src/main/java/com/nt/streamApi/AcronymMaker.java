package com.nt.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

	/*
	Examples
	(inputs/outputs grouped)
	
	United States of America
	USA
	
	Light Amplification by Stimulation of Emitted Radiation
	LASER
	
	united states of america
	USA
	
	Jordan Of the World
	JTW
	*/

public class AcronymMaker {
	private static final List<String> STOP_WORDS = Arrays.asList("AND", "OR", "BY", "OF");	
	public static void main(String[] args) {
		System.out.println(acronym("United States of America"));
		System.out.println(acronym("Light Amplification by Stimulation of Emitted Radiation"));
	}

	public static String acronym(final String input) {
		return Arrays
				.stream(input.toUpperCase().split("\\s"))
				.filter(word ->!STOP_WORDS.contains(word))
				.map(w ->String.valueOf(w.charAt(0)))
				.collect(Collectors.joining(""));

	}

}
