package com.nt.hashMap;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 34);
		map.put("A", 908);

		for (Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
		map.forEach((key,value)->
		System.out.println("[key] :"+key+ " [value]:  "+value));
		
	}
}
