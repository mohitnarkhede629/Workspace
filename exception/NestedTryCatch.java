package com.te.exception;

public class NestedTryCatch {
	
	public static void main(String[] args) {
		
		System.out.println("Program start");
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("checked Exception handled");	
		}
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("Runtime  Exception handeled");
		}
		System.out.println("PROGRAM END");
	}

}
