package com.te.object;

import com.te.object.equals.Equals_Method;

public class Test implements Cloneable{
	String name;
	
	public boolean equals (Object obj) {
		return true;
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Test test=new Test();
		test.name="amir";
		Test test2= new Test();
		
		
		
		
		String s= "Mohit";
		String s1="Mohit";
		String s2= "Mohit NARKHEDE";
		
		
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2)); // comparing seq of chars as equals method is overrideen in String class
		
	//	System.out.println(test.equals(test2)); // comparing reference variables if we commente out the overridden equals method
		
		
		Test clone = (Test) test.clone();
		System.out.println(clone.hashCode());
		System.out.println(test.hashCode());
		System.out.println(clone.name);
		System.out.println(test.getClass());
		System.out.println(test.hashCode());
		System.out.println(test2.hashCode());
	}
}
		
		
	

