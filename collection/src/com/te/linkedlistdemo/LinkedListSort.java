package com.te.linkedlistdemo;

import java.util.LinkedList;
import java.util.Collections;

import java.util.Scanner;

import com.te.collection.comparator.Employee;
import com.te.collection.comparator.SortingOnName;
import com.te.collection.comparator.SortingOnSalary;

public class LinkedListSort {
	
	public static void main(String[] args) {

		LinkedList<Employee> linkedlist = new LinkedList<>();
		linkedlist.add(new Employee("Mohit", 1, 10000.12334));
		linkedlist.add(new Employee("Rohit", 10, 1000110.12334));
		linkedlist.add(new Employee("njdfbv", 18, 1000240.12334));
		linkedlist.add(new Employee("Om", 756, 10000.1342334));
		linkedlist.add(new Employee("Ajay", 23, 10003340.12334));
		linkedlist.add(new Employee("Maria", 45, 610000.12334));
		linkedlist.add(new Employee("zara", 435, 210000.12334));
		
		SortingOnName sortingOnName = new SortingOnName();
		SortingOnSalary sortingOnSalary = new SortingOnSalary();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the paratamer you want to sort");
		String next = scanner.next();
		
		if (next.equalsIgnoreCase("name")) {
			Collections.sort(linkedlist,sortingOnName);
			
		}
		if (next.equalsIgnoreCase("salary")) {
			Collections.sort(linkedlist,sortingOnSalary);
			
		}
		
		if (next.equalsIgnoreCase("id")) {
			
			Collections.sort(linkedlist);
			
		}
		
		for (Employee o: linkedlist) {
			System.out.println(o);
			
		}
		scanner.close();
		
		
		
		
		
		
		

	}

}
