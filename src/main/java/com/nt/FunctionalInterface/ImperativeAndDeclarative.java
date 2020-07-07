package com.nt.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImperativeAndDeclarative {
	public static String FEMALE= "FEMALE";
	public static void main(String[] args) {
		List<Person> pepole= List.of(
				new Person("Amresh","kumar",Gender.MALE),
				new Person("Mohan","Dega",Gender.MALE),
				new Person("puja","kumari",Gender.FEMALE),
				new Person("Sita","Devi",Gender.FEMALE)
				);
		
		System.out.println("// imperative approach ");
		
		// imperative approach 
		List<Person> females = new ArrayList<>();

		for (Person person : pepole) {
			if (FEMALE.equals(person.getGender().toString())) {
				females.add(person);
			}
		}
		for (Person female : females) {
			System.out.println(female.getFirstName());
		}
		System.out.println("//  Declarative approach");
		
		//  Declarative approach
							 pepole.stream()
								   .filter(person ->FEMALE.equals(person.getGender().toString()))
								   .collect(Collectors.toList())
								   .forEach(person->System.out.println(person.getFirstName()));
							 
				System.out.println("----------------foreach in differnt line ---------------------");
				
		List<Person> female1= pepole.stream()
				   					.filter(person ->FEMALE.equals(person.getGender().toString()))
				   					.collect(Collectors.toList());
					female1.forEach(person->System.out.println(person.getFirstName()));
		
					System.out.println("--------------- Predication ---------------------");
					
					
		Predicate<Person> personPredicate=person ->FEMALE.equals(person.getGender().toString());
				
		List<Person> female2= pepole.stream()
						   			.filter(personPredicate)
						   			.collect(Collectors.toList());
				female2.forEach(person->System.out.println(person.getFirstName()));
							 
	}

}
