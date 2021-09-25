package com.bridgelabz.day5program;

public class FlipCoin {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Flip coint you want");
		int f1 = utility.getIntValue();
		utility.flipCoin(f1);
	}
}
