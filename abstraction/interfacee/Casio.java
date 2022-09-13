package com.te.abstraction.interfacee;

public class Casio implements Calculator, ScientificCalculator{

	@Override
	public int add(int x, int y) {
		 
		return x+y;
	}

	@Override
	public int subs(int x, int y) {
		
		return x-y;
	}
	
	@Override
	public String trigono(String angle1,String angle2) {
		if (angle1.equals("sin")&& angle2.equals(angle2)) {
			return "tan";
			
		}
		return "I dont know";
	}

}
