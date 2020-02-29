package com.nt.FunctionalInterface;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
	public static String FEMALE= "FEMALE";
	public static void main(String[] args) {
		List<Person> pepole= List.of(
				new Person("Amresh","kumar",Gender.MALE),
				new Person("Mohan","Dega",Gender.MALE),
				new Person("puja","kumari",Gender.FEMALE),
				new Person("Sita","Devi",Gender.FEMALE),
				new Person("BOB"," ",Gender.PREFER_NOT_TO_SAY)
				);
		
		Function<Person,String> personStringFunction= person -> person.getGender().toString();
		ToIntFunction<String> length=String::length;
		IntConsumer println=System.out::println;
		
		pepole.stream()
				.map(person -> person.getGender().toString())
				.collect(Collectors.toSet())
				.forEach(System.out::println);
		
		
		pepole.stream()
				.map(personStringFunction)
				.mapToInt(length)
				.forEach(println);
		
		
		Boolean containsOnlyFemale=pepole.stream()
				.allMatch(person->FEMALE.equals(personStringFunction));
		System.out.println(containsOnlyFemale);
		
		
		Predicate<Person> personPredicate= person ->FEMALE.equals(person.getGender().toString());
		Boolean containsOnlyFemales=pepole.stream()
				.anyMatch(personPredicate);
		System.out.println(containsOnlyFemales);
	}
		
	
	

}
