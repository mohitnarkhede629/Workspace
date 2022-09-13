package com.te.collection.set1;

import java.util.Comparator;

public class SortingOnGender implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.gender.compareTo(o2.gender);
	}

}
