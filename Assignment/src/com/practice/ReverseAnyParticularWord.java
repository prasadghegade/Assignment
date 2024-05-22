package com.practice;

public class ReverseAnyParticularWord {
	
	public static void main (String [] args) {
		
		String example="Prasad is a bad boy";
		
		String [] arr =example.split(" ");
		int revIndex = 4;
		String rev="";
		String op= arr[revIndex-1];
		
		for(int i=0; i< op.length(); i++) {
			
			rev=op.charAt(i)+rev;
			
		}
		
		arr[revIndex-1] = rev;
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i]+ " ");
		}
				
		
	}

}
