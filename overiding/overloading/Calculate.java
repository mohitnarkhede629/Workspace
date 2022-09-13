package com.te.overiding.overloading;

public class Calculate {
	
	public static void main(String[] args) {
		
		Calculator calculator=new ScientificCalculator();
		
		int add=calculator.add(10, 20);
		System.out.println(add);
		
		
		
		
		
		
	}

}

