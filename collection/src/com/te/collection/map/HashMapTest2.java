
/*  use Comparator Interface in this Program */
package com.te.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Mohit");
		hashMap.put(2, "Rohit");
		hashMap.put(3, "Hohit");
		hashMap.put(4, "Kohit");
		hashMap.put(5, "Qohit");
		hashMap.put(6, "Fohit");
		
		Set<Integer> keySet = hashMap.keySet();
		
		Iterator<Integer> iterator = keySet.iterator();
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer+":"+ hashMap.get(integer) );
			
		}
		
	}

	
	
}
