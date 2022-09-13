package com.te.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<Employee> arraylist = new ArrayList<>();
		arraylist.add(new Employee("Mohit", 1, 10000.12334));
		arraylist.add(new Employee("Rohit", 10, 1000110.12334));
		arraylist.add(new Employee("njdfbv", 18, 1000240.12334));
		arraylist.add(new Employee("Om", 756, 10000.1342334));
		arraylist.add(new Employee("Ajay", 23, 10003340.12334));
		arraylist.add(new Employee("Maria", 45, 610000.12334));
		arraylist.add(new Employee("zara", 435, 210000.12334));
		
//		System.out.println("********************************************************************************");
//		System.out.println(arraylist);
		
		SortingOnName sortingOnName = new SortingOnName();
		SortingOnSalary sortingOnSalary = new SortingOnSalary();
		

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the paratamer you want to sort");
		String next = scanner.next();
		
		if (next.equalsIgnoreCase("name")) {
			Collections.sort(arraylist,sortingOnName);
			
		}
		if (next.equalsIgnoreCase("salary")) {
			Collections.sort(arraylist,sortingOnSalary);
			
		}
		
		if (next.equalsIgnoreCase("id")) {
			
			Collections.sort(arraylist);
			
		}
		
		for (Employee o: arraylist) {
			System.out.println(o);
			
		}
		scanner.close();
		
		

	}

}
