package com.te.collection.set;


import java.util.Comparator;
import java.util.Objects;


public class Student implements Comparator<Student> {
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
		
		return Objects.hash(name,gender);
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		if ((this.name==student.name) && (this.rollNo==student.rollNo)&&(this.gender==student.gender) ) {
			return true;
		}
			
		
		else
		return false;
	}

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}

//	@Override
//	public int compareTo(Student o) {
//		
//		return this.name.compareTo(o.name);
//	}

	


	

	

	

//	@Override 
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	

}
