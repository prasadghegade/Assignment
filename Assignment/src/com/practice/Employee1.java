package com.practice;

import java.util.Scanner;

public class Employee1 {
	
	private String firstName;
	private String lastName;
	private String city;
	private long mobileNumber;
	private static String country="India";
	
	
	public Employee1(String firstName, String lastName, String city, long mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.mobileNumber = mobileNumber;
	}


	@Override
	public String toString() {
		return "Assignment8 [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", mobileNumber="
				+ mobileNumber + "]";
	}
		
	
}

class Employee_Information{
	
	void getUserInput() {
	boolean isNext=true;
	while(isNext) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first name");
	String firstName=sc.next();
	System.out.println("Enter last name");
	String lastName=sc.next();
	System.out.println("Enter city");
	String city=sc.next();
	System.out.println("Enter mobile number");
	long mobileNumber =sc.nextLong();
	
	Employee1 employee = new Employee1(firstName, lastName, city, mobileNumber);
	getEmployeeInformation(employee);
	
	System.out.println("Do you want add more employee :: Y/N");
	char userInput = sc.next().charAt(0);
	if(userInput == 'N'  || userInput =='n') {
		isNext=false;
	}
	}
}
	void getEmployeeInformation(Employee1 employee ) {
		System.out.println(employee);
	}
}

