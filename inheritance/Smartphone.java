package com.te.inheritance;

public class Smartphone extends Phone{
	
	int camera;
	int ram;
	
	public void videoCall(String name) {
		System.out.println("calling "+name);
	}
	
	public void play(String name) {
		System.out.println("playing"+ name);
	}
	public void call(String name) {
		System.out.println("checking the network"+"calling..."+name);
	}
	
	public void browse(String browser) {
		System.out.println("browser "+browser +"is browsing");
	}
	public static void simcard() {
		System.out.println("insert sim using sim tool");
		
	}
	
	public Smartphone(String string, int i, String string2) {
		super("nokia",1200,"black");
	}
	public Smartphone(int camera, int ram) {
		
		super("nokia",1200,"black");
		
		
		this.camera=camera;
		this.ram=ram;
	}
	
	

}
