package com.te.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import com.te.collection.set.Student;

public class TreesetDemo {
	
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>();
		
		treeSet.add(new Student(1,"Mohit", "male"));
		treeSet.add(new Student(3,"Rohit", "male"));
		treeSet.add(new Student(4,"Ohit", "male"));
		treeSet.add(new Student(67,"Tohit", "male"));
		treeSet.add(new Student(888,"Wohit", "female"));
		treeSet.add(new Student(76,"Pohit", "female"));
		treeSet.add(new Student(8,"Nohit", "female"));
		
		System.out.println(treeSet);
		
		Iterator<Student> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Student student =  iterator.next();
			System.out.println(student);
			
		}
		
		
	}

}
