package com.practice;

public class Assignment7 {

	public static void main(String[] args) {
		
		Assignment7 a7 = new Assignment7();
//		a7.checkMethod('Z');
//		int cube = a7.getCube(5);
//		System.out.println(cube);
		
//		a7.FactorOfNum(6);
		a7.getReverseNumber(12345);


	}
	public void checkMethod(char ch) {
		if (ch >= 65 && ch<=90) {
			System.out.println("capital alphabet "+ch);
		}
		else if(ch >= 97 && ch <= 122) {
			System.out.println("small alphabet "+ch);
		}
		else if(ch >= 48 && ch <= 57) {
			System.out.println(" it is a digit " +ch);
		}
		else {
			System.out.println(" it is a special char " +ch);
		}
	}
	
	public int getCube(int num) {
		 int result=num*num*num;
		 return result;
	}
	
	public void FactorOfNum(int num) {
		
		for (int i=1; i<=num; i++) {
			
			if (num % i == 0) {
//				System.out.println("factors of "+num+" is " +i+" ");
				System.out.print(i+" ");
				
			}
		}
	}
	
	public void getReverseNumber(int num) {
		System.out.println("number before revese "+num);
		int rev=0;
		while(num != 0) {
			
			int remainder=num%10;
			rev=rev *10+remainder;
			num=num/10;
		}
		System.out.println("number after revserse "+rev);
//		return rev;
		
	} 
}
