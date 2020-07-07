package com.nt.FunctionalInterface;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		
		System.out.println("Without predicate ");
		System.out.println(isPhoneNumber("09235423545"));
		System.out.println(isPhoneNumber("08765432123"));

		System.out.println("with predicate ");
		System.out.println(isPhoneNumberPredicate.test("09235423545"));
		System.out.println(isPhoneNumberPredicate.test("08765432123"));
	}

	public static Boolean isPhoneNumber(String phoneNumber) {
		return phoneNumber.startsWith("09") && phoneNumber.length() == 11;
	}
	
	
	// Functional interface Predicate
	public static Predicate<String> isPhoneNumberPredicate=phoneNumber->
					phoneNumber.startsWith("09") && phoneNumber.length() == 11;

}
