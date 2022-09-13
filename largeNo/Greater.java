package com.te.largeNo;

public class Greater {
	
		
		public static void main(String []args) {
			
			int x=10;
			int y=20;
			int z=30;
			int a=1;
			int b=300;
			
			if (a>b && a>x && a>y && a>z) {
				
				System.out.println(a);	
			}
			else if (b>x&& b>y&& b>z) {
				System.out.println(b);
				
			}
			else if (x>y&&x>z) {
				System.out.println(x);
				
			}
			else if (y>z) {
				System.out.println(y);
				
			}
			else {
				System.out.println(z);
			}
			
			
			
		}
		
		

	}


