package com.practice;

public class Assignment2 {

	int a = 70;
	static int b=140;

	public static void main(String[] args) {

		Assignment2 a2 = new Assignment2();
		char ch = a2.firstCharOfName("Prasad");
		System.out.println("first character of name is " + ch);

		System.out.println("------------------");

		a2.m1();

		System.out.println("-----------------");
		System.out.println(a2.a);
		System.out.println(b);
		a2.a = 50;
		System.out.println(a2.a);

	}

	public char firstCharOfName(String name) {
		char ch = name.charAt(0);
		return ch;
	}

	public void m1() {
		int b = 50;

		System.out.println(b);
	}

}
