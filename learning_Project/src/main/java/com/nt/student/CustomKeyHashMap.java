package com.nt.student;

import java.util.HashMap;

public class CustomKeyHashMap {
	public static void main(String[] args) {
		HashMap<student, String> hMap = new HashMap<student, String>();
		hMap.put(new student("Amresh", "Kumar"), "Bihar");
		hMap.put(new student("Abhishek", "Pandey"), "Ranchi");
		hMap.put(new student("Amresh", "Kumar"), "Bihar");
		hMap.put(new student("Kundan", "singh"), "Baliya");

		System.out.println("Size: " + hMap.size());
		System.out.println("Size: " + hMap.entrySet());

		hMap.entrySet().forEach(x -> {
			System.out.println(x.getKey().getFirstName() + "   ;  " + x.getKey().getLastName() + "  ;  " + x.getValue());
		});
	}

}
