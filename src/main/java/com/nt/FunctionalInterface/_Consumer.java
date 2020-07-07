package com.nt.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
		Person amresh = new Person("amres", "kumar", Gender.MALE);
		greetPerson(amresh);
		System.out.println("---------consumer  Function Interface ------------------");
		// consumer Function Interface
		greetPersonConsumer.accept(amresh);
		System.out.println("-----------Biconsumer  Function Interface-------------");
		greetPersonBiConsumer.accept(amresh, false);
	}

	static BiConsumer<Person, Boolean> greetPersonBiConsumer = (person, showgender)
					-> System.out.println("hello " + person.getFirstName() + " " + person.getLastName() + " "
															+ (showgender ? person.getGender() : "nothing ") + " thank");

	static Consumer<Person> greetPersonConsumer = person -> System.out.println(
			"hello " + person.getFirstName() + " " + person.getLastName() + " " + person.getGender() + " thank you ");

	public static void greetPerson(Person person) {
		System.out.println("hello " + person.getFirstName() + " " + person.getLastName() + " " + person.getGender()
				+ " thank you ");
	}
}
