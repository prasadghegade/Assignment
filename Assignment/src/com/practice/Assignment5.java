package com.practice;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number");
//		int number = sc.nextInt();
		System.out.println("enter the year");
		int year = sc.nextInt();
		
		Assignment5 a5 = new Assignment5();
		
//		a5.evenOrOdd(number);
//		a5.numIsPosOrNeg(number);
		a5.yearIsLeapOrNot(year);
	}
	
	public void evenOrOdd(int number) {
		if(number % 2 == 0) {
			System.out.println(number+ " is even number");
		}
		else {
			System.out.println(number+ " is odd number");
		}
		
	}
	
	public void numIsPosOrNeg(int number) {
		if (number > 0) {
			System.out.println(number+ " is postive");
		}
		else {
			System.out.println(number+ " is negative");
		}
	}
	
	public void yearIsLeapOrNot(int year) {
		if(year % 4 ==0) {
			System.out.println(year+ " is leap year");
		}else {
			System.out.println(year+ " is not leap year");
		}
		
	}

}
