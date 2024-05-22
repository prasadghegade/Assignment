package com.practice;

public class Example_Test11 {
	
	static int count =0;
	
	public Example_Test11() {
		count++;
	};
	
	public Example_Test11(String name) {
		count++;
	};

	public static void main(String[] args) {
		Example_Test11 t11 = new Example_Test11();
		Example_Test11 t12 = new Example_Test11();
		Example_Test11 t13 = new Example_Test11("Prasad");
		
		System.out.println(t12.count);
	}													
}
