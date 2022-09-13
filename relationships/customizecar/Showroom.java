package com.te.relationships.customizecar;

import java.util.Scanner;

public class Showroom {
	
	
	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter car brand.Enter 1 for tesla .Enter 2 for Honda ");
		int brand=scanner.nextInt();
		System.out.println("Enter color of the Car. Enter 1 for white. Enter 2 for Black");
		int color=scanner.nextInt();
		System.out.println("Enter Engine you want.  ");
		System.out.println("1 for E1 or Enter 2 for E2");
		int choice=scanner.nextInt();
		Owner owner=new Owner();
		owner.getCar( brand, color);
		owner.getEngine(choice));
	}

}
