package com.nt.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sun.tools.javac.comp.Enter;

public class StudentSortbyMaleFemaleInList {
	public static void main(String[] args) {
		List<Student> StudentList = Arrays.asList(new Student("Amresh", "Kumar", "Male"),
				new Student("Abhishek", "Pandey", "Male"), new Student("Amresh", "Kumar", "Male"),
				new Student("Kundan", "singh", "Male"), new Student("Kumari", "singh", "Female"),
				new Student("Kushbu", "Devi", "Female"), new Student("dolly", "Kumari", "Female"),
				new Student("puja", "singh", "Female"));

		Map<String, List<Student>> hashMap = new HashMap<String, List<Student>>();
		List<Student> maleList = new ArrayList<Student>();
		List<Student> femaleList = new ArrayList<Student>();
		for (Student student : StudentList) {
			String gender = student.getGender();
			if ((gender.toLowerCase()).equals("male")) {
				maleList.add(student);
			} else {
				femaleList.add(student);
			}
		}
		for (Student student : femaleList) {
			
		}
		hashMap.put("Male", maleList);
		hashMap.put("Female", femaleList);
//		System.out.println("Size: " + hashMap.size());
//		System.out.println("Size: " + hashMap.entrySet());

		for (String entry : hashMap.keySet()) {
			List<Student> s = hashMap.get(entry);
			Student ss = s.get(0);
			ss.getFirstName();
			ss.getGender();
			
		}
		hashMap.forEach((key,value)->System.out.println(key + "  " + value.get(0).getFirstName() +" "+value.get(0).getLastName()));

	}

}
