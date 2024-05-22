package com.practice;

public class Loops {

	public static void main(String[] args) {
		Loops l1 = new Loops();
//		l1.forLoop1();
//
//		System.out.println("-------------while---------");
//
		l1.whileLoop2();

//		l1.forLoop2();
//		l1.loop3();
	}

	public void forLoop1() {

		for (int i = 1; i <= 20; i++) {
			System.out.println("Numbers is " + i);
		}
	}

	public void whileLoop1() {
		int i = 10;
		while (i <= 50 && i % 2 == 0) {
			System.out.println(" number is " + i);
			i++;
		}
	}
	
	public void whileLoop2() {
		int i = 10;
		while (true) {
			System.out.println(" number is " + i);
			i--;
			if(i==0) {
				continue;
			}
			break;
		}
	}

	public void forLoop2() {
		int i = 1;
		for (; i < 5; i++) {
			System.out.println(i);
		}
	}

	public void loop3() {
		int i = 10;
		for (; i<15;) {
			System.out.println(i);
			i++;
		}
	}
}
