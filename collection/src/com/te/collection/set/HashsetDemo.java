package com.te.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashsetDemo {
	public static void main(String[] args) {
		Set<Student> hashset = new HashSet<>();
		Student student = new Student(1, "Mohit", "m");
		Student student2 = new Student(2, "Rohit", "m");
		Student student3 = new Student(3, "Rohit", "m");
		Student student4 = new Student(4, "Ravi", "m");
		Student student5 = new Student(4, "Ravi", "m");

		hashset.add(student);
		hashset.add(student2);
		hashset.add(student3);
		hashset.add(student4);
		hashset.add(student5);

		List<Student> arrayList = new ArrayList<>(hashset);
		Collections.sort(arrayList);

		Iterator<Student> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

}
