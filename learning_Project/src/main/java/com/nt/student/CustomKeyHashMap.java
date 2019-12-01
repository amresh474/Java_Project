package com.nt.student;

import java.util.HashMap;

public class CustomKeyHashMap {
	public static void main(String[] args) {
		HashMap<Student, String> hMap = new HashMap<Student, String>();
		hMap.put(new Student("Amresh", "Kumar", "Male"), "Bihar");
		hMap.put(new Student("Abhishek", "Pandey", "Male"), "Ranchi");
		hMap.put(new Student("Amresh", "Kumar", "Male"), "Bihar");
		hMap.put(new Student("Kundan", "singh", "Male"), "Baliya");
		hMap.put(new Student("Kumari", "singh", "Female"), "Baliya");
		hMap.put(new Student("Kushbu", "Devi", "Female"), "Baliya");
		hMap.put(new Student("dolly", "Kumari", "Female"), "Baliya");
		hMap.put(new Student("puja", "singh", "Female"), "Baliya");

		System.out.println("Size: " + hMap.size());
		System.out.println("Size: " + hMap.entrySet());

		hMap.entrySet().forEach(x -> {
			System.out.println(x.getKey().getFirstName() + "  ;  " + x.getKey().getLastName() + "  ;  " + x.getValue());
		});
	}

}
