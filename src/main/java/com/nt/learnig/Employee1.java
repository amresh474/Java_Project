package com.nt.learnig;

import java.util.ArrayList;

import lombok.Data;
@Data
public class Employee1 {
	private String id;
	private String name;
	private String age;
	
	public static void main(String[] args) {
	    ArrayList<Employee1> list1 = new ArrayList<Employee1>();
	    ArrayList<Employee1> list2 = new ArrayList<Employee1>();
//	    Employee1 employee=new Employee1( "1234","amresh","34");
//	    Employee1 employee1=new Employee1( "1234","amresh","");
//	    
//	    Collections.addAll(list1, 4, 3);
//	    Collections.addAll(list2, 5, 10, 4, 3, 7);
//	    smartCombine(list1, list2);
	    System.out.println(list1);
	}
	public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
	    for (Integer num : second) {
	        if (!first.contains(num)) {
	            first.add(num);
	        }
	    }
	}
}
