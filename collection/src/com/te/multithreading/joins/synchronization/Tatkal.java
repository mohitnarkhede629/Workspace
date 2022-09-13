package com.te.multithreading.joins.synchronization;

public class Tatkal {
			public static void main(String[] args) {
				
				Irctc irctc = new Irctc();
				User mohit = new User(20, "Mohit", irctc);
				User rutuja = new User(120, "Rutuja", irctc);
				User ashwini = new User(65, "Ashwini", irctc);
				User rahul = new User(74, "Rahul", irctc);
				
				
				rutuja.start();
				ashwini.start();
				mohit.start();
				rahul.start();
				
				
				String s= "abcde";
				System.out.println(s.substring(1, 3));
				
				
			}
}
