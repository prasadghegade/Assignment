package com.practice;

import java.util.Scanner;

public class Assisgnment4_1 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter number");
//		int num =sc.nextInt();
		
		Assisgnment4_1 a4 = new Assisgnment4_1();
		a4.month(12);
//		a4.numIsGreaterThan(num);
//		a4.swaptwoNumber(10, 12);
//		a4.squareNum(num);
//		
//	}
//	public void squareNum(int number) {
//		 int result=number*number;
//		
//		System.out.println("square of number " +number+ " is "+result);
		
	}	
//		public void numIsGreaterThan(int num) {
//			if(num > 100) {
//				System.out.println(num+ " is greater than 100");
//			}
//			else {
//				System.out.println(num+ " is not greater than 100");
//			}
//		}
//		
//		public void swaptwoNumber(int a, int b) {
//			System.out.println("numbers before swap " +a+" "+b);
////			int c=a;
////			a=b;
////			b=c;
//			
//			a=a+b;   // 10+15=25
//			b=a-b;  //25-15=10
//			a=a-b; //25-10=15
//			
//			a=a*b;  //10*15=150;
//			b=a/b;  //150/15=10
//			a=a/b;  //150/10=15
//			
//			
//			System.out.println("numbers after swap " +a+" "+b);
			
	//	}
		
		public void month(int month) {
			switch (month) {
			case 1:
				System.out.println("January");
				break;
				
			case 2:
				System.out.println("Feburary");
				break;
				
			case 3:
				System.out.println("March");
				break;
				
			case 4:
				System.out.println("April");
				break;
				
			case 5:
				System.out.println("May");
				break;
				
			case 6:
				System.out.println("June");
				break;
				
			case 7:
				System.out.println("July");
				break;
				
			case 8:
				System.out.println("Augest");
				break;
				
			case 9:
				System.out.println("September");
				break;
				
			case 10:
				System.out.println("Octomber");
				break;
				
			case 11:
				System.out.println("November");
				break;
				
			case 12:
				System.out.println("December");
				break;

			default:
				
				System.out.println("please pass correct month number");
				break;
			}
		}
	

}
