package com.te.specifier;

public class Test {
	
		private int x;
		protected int y;
		public int z;
		int a;
		
		
		private void m1() {
			System.out.println("I am private");
		}
		
		public void m2() {
			System.out.println("I am public");
			
			
		}
		protected void m3() {
			System.out.println("I am protected");
			
			
		}
		 void m4() {
			System.out.println("I am default");
			
			
		}
		 public static void main(String[] args) {
			Test test =new Test();
			System.out.println(test.x);
			System.out.println(test.y);
			System.out.println(test.z);
			System.out.println(test.a);
			test.m1();
			test.m2();
			test.m3();
			test.m3();
			
		}
		
	}


