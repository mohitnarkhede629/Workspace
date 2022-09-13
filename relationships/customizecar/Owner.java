package com.te.relationships.customizecar;

public class Owner {
	Car car;
	Engine engine;
	
	public void getCar(int brand,int color) {
		
		if (brand==1 && color==1 ) {
			 this.car=new Tesla("Tesla","White");
			 System.out.println("Tesla");
				
		}
		if (brand==2 && color==1) {
			this.car=new Honda("Honda","White");
			
		}
		if (brand==1 && color==2) {
			this.car=new Tesla("Tesla","Black");
			
		}
		if (brand==2 && color==2) {
			this.car=new Tesla("Honda","Black");
		}
			
		}
	
	
      public void getEngine(String horseP) {
		
		if (choice==1) {
			
			this.engine=new Engine1("100 hp","2000 cc","Oil cooling system");
			System.out.println("Engine 1 is fitted in your"+this.car+"car");
	}
		if (choice==2) {
			this.engine=new Engine2("200 hp","3000 cc","oil cooling system");
			System.out.println("Engine 2 is fitted in your"+this.car+"car");
		}		
		
	
	
	

}
}		
		
	//Binding data members with the method implementation
		
		
		
	


