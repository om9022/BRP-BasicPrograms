package com.bridgelabz.day4program;

public class HarmonicNumber {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter num to Check Harmo number: ");
		int num = utility.getIntValue();
		utility.getHArmonicNumber(num);
	}
}
