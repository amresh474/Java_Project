package com.nt.FunctionalInterface;

import java.util.function.Consumer;

public class _Callbacks {
	public static void main(String[] args) {

		hello("amresh", "kumar", value -> {
			System.out.println("No lastName provided" + value);
		});
		
		System.out.println(" no lastname provided ");
		hello("amresh", null, value -> {
			System.out.println("No lastName provided" + value);
		});

		
		System.out.println("-----runable---------");
		hello2("amresh",
				null, 
				()-> System.out.println("No lastName provided"));
	}
	
	
	
	public static void hello(String firstName, String lastName, Consumer<String> callback) {
		System.out.println(firstName);
		if (lastName != null) {
			System.out.println(lastName);
		} else {
			callback.accept(firstName);
		}
	}
	
	public static void hello2(String firstName, String lastName, Runnable callback) {
		System.out.println(firstName);
		if (lastName != null) {
			System.out.println(lastName);
		} else {
			callback.run();
		}
	}
	
	
//	function hello(firstName,lastName,callback) {
//		console.log(firstName);
//		if(lastName) {
//			console.log(lastName);
//		}
//		else {
//			callback();
//		}
//	}

}
