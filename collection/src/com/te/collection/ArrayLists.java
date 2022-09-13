package com.te.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
	
	public static void main(String[] args) {
			ArrayList<Object> arraylist=new ArrayList<>();
			arraylist.add(100);
			arraylist.add('a');
			arraylist.add("Mohit");
			arraylist.add(null);
			arraylist.add(178);
			arraylist.add("Mohit");
			
		System.out.println("==========using for loop============");	
			for (int i = 0; i< arraylist.size(); i++) {
				
				System.out.println(arraylist.get(i));
				
			}
			
			
			System.out.println("=======Using ADV FOR loop============");
			
			for(Object obj : arraylist) {
				System.out.println(obj);
			}
			
			System.out.println("========Using Iterator interface=========");
			
			Iterator <Object> iterator=arraylist.iterator();
				while (iterator.hasNext()) {
					
					System.out.println(iterator.next());
					
				}
	

}}
