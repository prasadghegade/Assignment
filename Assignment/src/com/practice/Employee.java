package com.practice;

import java.util.Scanner;

public class Employee {

	String firstName;
	String lastName;
	String city;
	long mobileNumber;
	static String country = "India";

	public void getUserInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter first name");
		firstName = sc.nextLine();

		System.out.println("enter last name");
		lastName = sc.nextLine();

		System.out.println("enter the city");
		city = sc.next();

		System.out.println("enter the mobile number");
		mobileNumber = sc.nextLong();
	}

	public void getEmployeeInformation(String fName, String lName, String city, long mobileNumber) {
		System.out.println("first name " +fName);
		System.out.println("last name " +lName);
		System.out.println("city name " +city);
		System.out.println("mobile number " +mobileNumber);
		System.out.println("country name " +country);
	}
	
	public void execution() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the num of student");
	int numOfStudent = sc.nextInt();
	
	for (int i = 1; i <= numOfStudent; i++) {
		getUserInput();

		getEmployeeInformation(firstName, lastName, city, mobileNumber);
	}
	}
}
