package com.raju.model;

public class Subclass extends Child {
int a=10;
	public void updateEmployee() {
		int a=20;
		
		System.out.println(" Global value : "+this.a);
		System.out.println("Local value : "+a);
		System.out.println("super class value: "+super.a);
	}
	public static void main(String args[]) {
		
		Subclass s=new Subclass();
		s.updateEmployee();
		
		
	}
	
}
