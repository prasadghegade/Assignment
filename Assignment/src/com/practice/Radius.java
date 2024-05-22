package com.practice;

public class Radius {
	
	public static void main(String[] args) {
		System.out.println(Radius.calculateRadius(2.1));
	}
	
	public static double calculateRadius(double d) {
		float pie=3.14f;
		
		return pie * Math.pow(d, 2);
		
		
		
	}

}
