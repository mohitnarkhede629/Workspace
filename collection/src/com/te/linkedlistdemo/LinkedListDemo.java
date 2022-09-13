package com.te.linkedlistdemo;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Object> linkedList=new LinkedList<>();
		linkedList.add(100);
		linkedList.add('a');
		linkedList.add("Mohit");
		linkedList.add(null);
		linkedList.add(178);
		linkedList.add("Mohit");
		
		
		System.out.println(linkedList);
		
	System.out.println("==========using for loop============");	
		for (int i = 0; i< linkedList.size(); i++) {
			
			System.out.println(linkedList.get(i));
			
		}
		
		
		System.out.println("=======Using ADV FOR loop============");
		
		for(Object obj : linkedList) {
			System.out.println(obj);
		}
		
		System.out.println("========Using Iterator interface=========");
		
		Iterator <Object> iterator=linkedList.iterator();
			while (iterator.hasNext()) {
				
				System.out.println(iterator.next());
				
}
	}} 
