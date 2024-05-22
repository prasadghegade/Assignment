package com.practice;

import java.util.Scanner;

public class Assignment_12 implements Assignment12 {

	@Override
	public void getSavingAccount() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("Enter the balance");
		float balance = sc.nextFloat();
		
		getUserDetails(name, balance);
		
	}

	@Override
	public void getUserDetails(String name, float balance) {
		System.out.println("User Name : "+name);
		System.out.println("User Balance : "+balance);
		
	}
	
	public static void main(String[] args) {
	
		Assignment_12 a12 = new Assignment_12();
		a12.getSavingAccount();
		
	}

}
