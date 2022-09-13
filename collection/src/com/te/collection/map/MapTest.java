package com.te.collection.map;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Set;

public class MapTest   /*hashmap*/ {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1, "Mohit");
		hashMap.put(2, "Rohit");
		hashMap.put(3, null);
		hashMap.put(4, null);
		hashMap.put(null, "Mohit");
		
		//System.out.println(hashMap);
		
	 Set<Integer> keySet = hashMap.keySet();
	 
	 Iterator<Integer> iterator = keySet.iterator();
	 while (iterator.hasNext()) {
		Integer key = (Integer) iterator.next();
		
		System.out.println(key+":::"+ hashMap.get(key));
		
	}
	 
	 
		
		
		
	}

 
}
