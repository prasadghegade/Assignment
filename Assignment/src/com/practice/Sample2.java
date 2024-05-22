package com.practice;

public class Sample2 {

	public static void main(String[] args) {

		int num = 1234561;

		for (int i = 0; i <= num; i++) {

			int op = num % 10;

			if (op % 2 == 0) {
				System.out.println("even number " + op);
			} else {
				System.out.println("odd number " + op);
			}

			num = num / 10;
		}

	}

}
