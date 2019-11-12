package com.merck.learning;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removed_duplicates_from_ArrayList {
	public static void main(String[] args) {
		List<Integer> primes=new ArrayList<Integer>();
		primes.add(78);
		primes.add(4547);
		primes.add(23725734);
		primes.add(78);
		
		Set<Integer> removeDublictae= new LinkedHashSet<Integer>(primes);
		primes.clear();
		primes.addAll(removeDublictae);
		
		System.out.println(primes);
	}

}
