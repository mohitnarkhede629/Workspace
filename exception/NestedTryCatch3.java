package com.te.exception;

public class NestedTryCatch3 {
	
	public void m1() {
		try {
			m2(1);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void m2(int i)throws Exception {
		if (i==1) {
			throw new Exception();
			
		} else {
			System.out.println(i);

		}
	}
	
	public static void main(String[] args) {
		System.out.println("Program Start");
		try {
			new NestedTryCatch3().m1();
		} catch (Exception e) {
		System.out.println("From main");
		}
		System.out.println("Program End ");
		
	}

}
