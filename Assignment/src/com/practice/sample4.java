package com.practice;

public class sample4 {

	/*
	 * Sum of the prime numbers digit from given number 24568 Output 7
	 */

	public static void main(String[] args) {
		int number = 24568;
		int numLen = String.valueOf(number).length();
		int count = 0;
		int sum = 0;
		
		
		for (int i = 1; i <= numLen; i++) {

			int rem = number % 10;

			for (int j = 1; j <= rem; j++) {

				if (rem % j == 0) {
					count++;
				}
				
				if (count == 2) {
					sum = sum + rem;
				}
			}


		}
		number = number / 10;
		System.out.println(sum);
	}

}
