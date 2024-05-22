package com.practice;

public class Assignment4 {

	public static void main(String[] args) {
		Assignment4 a4 = new Assignment4();
		int result = a4.addOfTwonum(10, 20);
		System.out.println("Sum of two numbers " + result);
		byte a = 10;
		byte b = 20;

		byte result1 = a4.addOfTwonum1(a, b);
		System.out.println("addition of two byte numbers " + result1);

		int sub = a4.subtracctionOfTwoNumbers(100, 50);
		System.out.println("Subtraction of a and b is " + sub);

		int mul = a4.multiplicationOfTwoNumbers(5, 5);
		System.out.println("Multiplication of a and b is " + mul);

		int div = a4.divisionOfTwoNumbers(500, 50);
		System.out.println("Division of and b is " + div);
		
		int result2 = a4.fiveSubjectResult(100, 100, 100, 100, 50);
		System.out.println("Average of five subject is " +result2);

	}

	public int addOfTwonum(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public byte addOfTwonum1(byte a, byte b) {
		byte sum = (byte) (a + b);
		return sum;

	}

	public int subtracctionOfTwoNumbers(int a, int b) {
		int sub = a - b;
		return sub;
	}

	public int multiplicationOfTwoNumbers(int a, int b) {
		int mul = a * b;
		return mul;
	}

	public int divisionOfTwoNumbers(int a, int b) {
		int div = a / b;
		return div;
	}
	
	public int fiveSubjectResult(int marathi, int hindi, int english, int science, int math) {
		int sumOfAllSubject = marathi+hindi+english+science+math;
		int total_Subject=5;
		int avg=sumOfAllSubject/total_Subject;
		return avg;
	}

}
