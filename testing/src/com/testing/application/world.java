package com.testing.application;

public class world {
	
	public static void main(String[] args) {
		int a = 15;
		int b = 10;
		
		Human obj = new Human();
		obj.running();
		obj.walking(a, b);
		
		if(a > b) {
			System.out.println("greater than");
		}else if(a < b) {
			System.out.println("less than");
		}else {
			System.out.println("equal");
		}
		
		//Looping
		int i;
		for(i=0; i<5; i++) {
			System.out.println("insiude loop"+i);
		}
		
		
		
	}

}
