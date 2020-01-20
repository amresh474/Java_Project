package com.nt.learning;

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
		System.out.println(primes);
		
		Set<Integer> removeDublictae= new LinkedHashSet<Integer>();
		for (Integer integer : primes) {
			if (removeDublictae.add(integer)==false) {
				System.out.println(integer);
			}
		}
		
		primes.clear();
//		System.out.println(removeDublictae.add(8));
		primes.addAll(removeDublictae);
		
		System.out.println(primes);
	}

}
