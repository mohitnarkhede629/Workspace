package com.te.collection.set1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.te.collection.set.SortingOnName;
import com.te.collection.set.Student;

public class HashSetComparatorTest {
	static SortingOnName sortingOnName = new SortingOnName();
	static SortingOnGender sortOnGender = new SortingOnGender();

	public static void main(String[] args) {
		// HashSetComparatorTest hashSetComparatorTest = new HashSetComparatorTest();
		HashSet<Student> hashSet = new HashSet<>();
		hashSet.add(new Student(1, "Akshay", "m"));
		hashSet.add(new Student(2, "Balu", "m"));
		hashSet.add(new Student(3, "CATHIE", "f"));
		hashSet.add(new Student(5, "DAMU", "o"));
		hashSet.add(new Student(7, "EUUU", "f"));
		hashSet.add(new Student(9, "Falcon", "f"));

		ArrayList<Student> arrayList = new ArrayList<>(hashSet);
		// Collections.sort(arrayList);
//		System.out.println(arrayList);

		Scanner scanner = new Scanner(System.in);
		String sortBy = scanner.next();

		if (sortBy.equalsIgnoreCase("name")) {

			Collections.sort(arrayList, sortingOnName);

		}

		if (sortBy.equalsIgnoreCase("rollNo")) {

			Collections.sort(arrayList);
		}

		Iterator<Student> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		scanner.close();
	}

}
