package com.gl.cc1;

public class ConstructorDemo {
	
	
	public ConstructorDemo() {
		
		System.out.println("Default Great Learning Constructor");
	}
	
	public ConstructorDemo(String name, int age, String location) {
		
		System.out.println("Parameterized Great Learning Contructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test Change")
		
		ConstructorDemo constructorDemo;
		constructorDemo= new ConstructorDemo();
		constructorDemo= new ConstructorDemo("Harshit", 25, "Bangalore");
	}

}
