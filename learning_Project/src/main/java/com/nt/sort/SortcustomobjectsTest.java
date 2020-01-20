package com.nt.sort;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortcustomobjectsTest {
	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();

		list.add(new Employee(1l, "Alex", LocalDate.of(2018, Month.APRIL, 21)));
		list.add(new Employee(4l, "Brian", LocalDate.of(2018, Month.APRIL, 22)));
		list.add(new Employee(3l, "Piyush", LocalDate.of(2018, Month.APRIL, 25)));
		list.add(new Employee(5l, "Charles", LocalDate.of(2018, Month.APRIL, 23)));
		list.add(new Employee(2l, "Pawan", LocalDate.of(2018, Month.APRIL, 24)));

		/*
		 * Comparable interface enables the natural ordering of the classes it
		 * implements. It makes the classes comparable to it’s instances.
		 * 
		 */
		Collections.sort(list);
		System.out.println("Comparable..."+list);

		/*
		 * Comparator
		 * 
		 * Many times we face situation where we do not seek natual ordering or class
		 * file unavilable for edit due to legacy code issue. In this case, we can take
		 * help of Comparator interface.
		 * 
		 */

		Collections.sort(list, new NameSorter());
		System.out.println("Comparator....."+list);

		/*
		 * Sort with Java 8 Lambda Java 8 Lambda expressions help in writing Comparator
		 * implementations on the fly. We do not need to create seperate class to
		 * provide the one time comparison logic.
		 * 
		 */

//		Comparator<Employee> nameSorter = (a, b) -> a.getName().compareToIgnoreCase(b.getName());
		/*  Java group by sort – Comparator.thenComparing()
		 * Collections.sort(list, new FirstNameSorter() 
		 * .thenComparing(new  LastNameSorter())
		 * .thenComparing(new AgeSorter()));
		 * 
		 */
		Comparator<Employee> nameSorter = (Employee o1, Employee o2) -> o1.getName().compareToIgnoreCase(o2.getName());
		Collections.sort(list, nameSorter);
		System.out.println("Java8 Lambda......"+list);
		
		/*
		 * Group by sorting To sort a collection of objects on different fields (groupby
		 * sort) using multiple comparators in chain. This chaining of comparators can
		 * be created using Comparator.comparing() and Comparator.thenComparing()
		 * methods.
		 * 
		 */
		Collections.sort(list, Comparator
                .comparing(Employee::getName)
                .thenComparing(Employee::getDob)
                .thenComparing(Employee::getId));
		System.out.println("Group By Sorting ...."+list);
	}
}
