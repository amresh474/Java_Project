package com.nt.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

public class JavaSortExample {

	public static void main(String[] args) {
		Integer[] numbers = new Integer[] { 15, 11, 9, 55, 47, 18, 520, 1123, 366, 420 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		// Sort the array in reverse order
		Arrays.sort(numbers, Collections.reverseOrder());
		System.out.println(Arrays.toString(numbers));

		// Java 8 parallel sorting
		Arrays.parallelSort(numbers);
		System.out.println(Arrays.toString(numbers));

		// Sort list in ascending order
		List<Integer> numberlist = Arrays.asList(numbers);
		Collections.sort(numberlist);
		System.out.println(numberlist);

		// Sort a Set
		HashSet<Integer> Numberset = new LinkedHashSet<Integer>(Arrays.asList(numbers));
		List<Integer> list = new ArrayList(Numberset);
		Collections.sort(list);
		Numberset = new LinkedHashSet<Integer>(list);
		System.out.println("=====" + Numberset);

		// Sort a Map by Key
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(50, "Alex");
		map.put(20, "Charles");
		map.put(60, "Brian");
		map.put(70, "Edwin");
		map.put(120, "George");
		map.put(10, "David");

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(map);
		System.out.println(map);
		
		
		
		// Sort a Map by Value
		HashMap<Integer, String> unSortedMap = new HashMap<Integer, String>();
		map.put(50, "Alex");
		map.put(20, "Charles");
		map.put(60, "Brian");
		map.put(70, "Edwin");
		map.put(120, "George");
		map.put(10, "David");
		LinkedHashMap<Integer,String> sortedmap=new LinkedHashMap<Integer, String>();
		
//		unSortedMap.entrySet().stream().sorted(arg0);
	}

}
