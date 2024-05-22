package com.practice;

public class sample1 {
	
	
	int a=10;
	float b=101f;
	double c=50;
	long d=10l;
	
	static int count;
	
	sample1(){
		count++;
	}
	
	public static void main(String[] args) {
		sample1 s = new sample1();
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s.c);
		System.out.println(s.d);
		
		sample1 s2 = new sample1();
		sample1 s3 = new sample1();
		sample1 s4 = new sample1();
		sample1 s5 = new sample1();
		
		System.out.println(sample1.count);
		
	}

}
