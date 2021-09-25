package com.bridgelabz.day4program;

public class TemperatureConversion {
	public static void main(String[] args) {
		Utility utility = new Utility();
		
		System.out.println("Celsius to Fahrenheit");
		System.out.println("Fahrenheit to Celsius");
		int num = utility.getIntValue();
		utility.tempConversion(num);
	}
}
