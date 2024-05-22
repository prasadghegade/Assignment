package com.practice;

import java.util.Arrays;

public class ReverseEntireSentenance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String example="Prasad is a bad boy. not going in a school";
		
		String arr[] = example.split(" ");
//		System.out.println(Arrays.toString(arr));
		
		for(int i=0 ; i<arr.length; i++) {
			 
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println(" -------------reverse sentense-----------");
		
		String rev ="";
		
		for(int i=0 ; i<arr.length; i++) {
			 
			rev = arr[i]+" "+rev;
		}
		
		System.out.println(rev);

	}

}
