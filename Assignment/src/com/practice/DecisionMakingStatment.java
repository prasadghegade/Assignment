package com.practice;

public class DecisionMakingStatment {

	public static void main(String[] args) {

		DecisionMakingStatment d1 = new DecisionMakingStatment();
		d1.m1();
		String ex = d1.m2(19, "boys");
		System.out.println(ex);
		
		d1.getBrowser("chrome");
		
//		byte marks=95;
//		char result = d1.result(marks);
//		System.out.println(result);
	}
	
	
	public void m1() {

		int x = 20;
		int y = 30;

		
		if (x + y >= 51) {
			System.out.println("x plus y is greater than or equal to 50");
		}

		else {
			System.out.println("x plus y is not greater than or equal to 50");
		}
	}

	public char result(byte marks) {

		if (marks >= 50 && marks < 60) {
			return 'D';
		} else if (marks >= 60 && marks < 70) {
			return 'C';
		} else if (marks >= 70 && marks < 80) {
			return 'B';
		} else if (marks >= 80) {
			return 'A';
		}

		else {
			return 0;
		}

	}

//	System.out.println("------------nested if----------");

	public String m2(int age, String gender) {
		if (age >= 18) {
			if (gender.equalsIgnoreCase("male")) {
				return "mens you can shop on 3rd floor";
			} else if (gender.equalsIgnoreCase("women")) {
				return "womens you can shop on 2nd floor";
			} else {
				return "womens you can shop on 4th floor";
			}
		} else {
			return "You can shop on 1st floor";
		}
	}
	
	public void getBrowser(String browserName) {
		
		switch (browserName) {
		case "chrome":
			System.out.println("chrome launched");		
			break;
			
		case "edge":
			System.out.println("edge launched");		
			break;
			
		case "firefox":
			System.out.println("firefox launched");		
			break;

		default:
			System.out.println("pass corect browser");
			break;
		}
	}

}
