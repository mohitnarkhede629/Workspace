package com.te.collection.set1;

import java.util.Objects;

public class Student implements Comparable<Student> {
	int rollNo;
	String name;
	String gender;

	public Student(int rollNo, String name, String gender) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public int hashCode() {

		return Objects.hash(name, gender);
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		if ((this.name == student.name) && (this.rollNo == student.rollNo) && (this.gender == student.gender)) {
			return true;
		}

		else
			return false;
	}

	@Override
	public int compareTo(Student o) {

		return this.rollNo - o.rollNo;
	}

//	@Override 
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
