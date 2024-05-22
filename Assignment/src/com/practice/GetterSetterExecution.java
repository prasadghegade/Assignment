package com.practice;

public class GetterSetterExecution {

	public static void main(String[] args) {

		GetterSetterEncapsulation e1 = new GetterSetterEncapsulation(10, "Prasad", "Ghegade");
		
		System.out.println(e1.getA());
		e1.setA(50);
		System.out.println(e1.getA());
		System.out.println(e1.getLastName());
		System.out.println(e1.getName());
		
		
		GetterSetterEncapsulation e2 = new GetterSetterEncapsulation(10, "Akshada", "Auti");
		
		System.out.println(e2.getA());
		System.out.println(e2.getLastName());
		System.out.println(e2.getName());
		
		GetterSetterEncapsulation e3 = new GetterSetterEncapsulation("bala", "maid");
		System.out.println(e3.getLastName());
		System.out.println(e3.getName());
		
	}

}
