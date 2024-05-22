package com.practice;

public class ReverseString {
	public static void main (String [] args) {
	String name ="Prasad";
	
	String rev="";
	
	for(int i=0; i<name.length(); i++) {
		
		rev=name.charAt(i)+rev;	
	}	
	System.out.println(rev);
	}
}
