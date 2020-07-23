package com.nt.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapiteration {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"Amresh");
		map.put(2,"Kumar");
		map.put(3,"Deepak");
		map.put(4,"dkumar");
		
		System.out.println("//Iterate over keys");
		Iterator<Integer> itr=map.keySet().iterator();
		
		while(itr.hasNext()) {
			Integer key=itr.next();
			String value=map.get(key);
			 System.out.println("The key is :: " + key + ", and value is :: " + value );		
		}	
		
	}

}
