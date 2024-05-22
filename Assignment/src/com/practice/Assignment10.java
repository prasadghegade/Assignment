package com.practice;

public class Assignment10 {

	public static void main(String[] args) {

		// Assignment10.numIsPrimeOrNot(20);
		Assignment10.sumOfDigit(123456);

	}

	public static void numIsPrimeOrNot(int num) {
		boolean prime = true;

		for (int i = 2; i < num; i++) {

			if (num % 2 == 0) {
				prime = false;
				break;
			}
		}

		if (prime && num != 1) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not prime number");
		}
	}

	public static void sumOfDigit(int num) {
		int sum = 0;

		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				sum += rem;
			}
			num = num / 10;
		}

		System.out.println(sum);

	}

}
