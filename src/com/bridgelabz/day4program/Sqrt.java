package com.bridgelabz.day4program;

public class Sqrt {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter num: ");
		int num = utility.getIntValue();
		Utility.sqrt(num);
	}
}
