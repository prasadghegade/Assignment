package com.practice;

public class GetterSetterEncapsulation {
	
	private int a;
	private String name;
	private String lastName;
	
	
	public GetterSetterEncapsulation(int a, String name, String lastName) {
		this.a = a;
		this.name = name;
		this.lastName = lastName;
	}


	public GetterSetterEncapsulation(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	


}
