package com.practice;

public class Assignment6 {

	public static void main(String[] args) {

		Assignment6 a6 = new Assignment6();
//		a6.printNumbersfrom25To50UsingWhile(25,50);
//		a6.multiplicationTable(10);
//		a6.printEvenNumbersBetweenTwoNumbers(50, 100);
		int fact = a6.factorial(5);
		System.out.println(fact);

	}

	public void printNumbersfrom25To50UsingWhile(int a, int b) {
//		int a=25;
//		int b=50;
		while (a <= b) {
			System.out.println(a);
			a++;
		}
	}

	public void multiplicationTable(int num) {
		for (int i = 1; i <= 10; i++) {
			int result = num * i;
			System.out.println(result);
		}
	}

	public void printEvenNumbersBetweenTwoNumbers(int a, int b) {
		while (a <= b) {
			if (a % 2 == 0) {
				System.out.println(a);

			}
			a++;
		}
	}

    public int factorial(int n) 
    { 
        int res = 1, i=2; 
 //       for (i = 2; i <= n; i++) 
        while(i <= n) {

            res *= i;
        	i++;
        }
        return res; 
    } 
  

}
