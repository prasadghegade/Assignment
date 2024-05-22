package com.practice;

public class PrintTheTable1To20 {

	public static void main(String[] args) {
		String table="";

		for(int i=2; i<=20; i++) {
			for(int j=1; j<=10; j++) {
				table += i*j+" ";	
			}
			System.out.println("table of "+i+" ["+table+"]");
			table="";
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=2; j<=20; j++) {
				table +=i*j+"\t";
			}
			System.out.println(table);
			table="";
		}

	}

}
