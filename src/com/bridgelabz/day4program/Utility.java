package com.bridgelabz.day4program;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
		
	}

	public int getIntValue() {
		
		return scanner.nextInt();
	}
	public void tempConversion(int select) {
		
		switch(select) {
		case 1:
			int F = 0;
			System.out.println("**Celsius to Fahrenheit***");
			System.out.println("Enter Celsius");
			int C = getIntValue();
			F = (C * 9/5) + 32;
			System.out.println(F + "   Degree Fehrenheit");
			break;
		case 2:
			int Celsius = 0;
			System.out.println("**Fahrenheit to Celsius***");
			System.out.println("Enter Fahrenheit");
			int Fahrenheit = getIntValue();
			Celsius = (Fahrenheit - 32) * 5/9;
			System.out.println(Celsius + "   Degree Celsius");
			break;
		}
	}

	public static void sqrt(int num) {
	        double epsilon = 1e-15;
	        float t = num;
	        while(Math.abs(t-num/t) > epsilon * t) {
	            t = (float) ((num/t + t)/2);     
	            }
	        System.out.println("Square root of " + num + " = " + t);
		
	}

	public void getHArmonicNumber(int num) {
		double HarmonicNumber = 0;
		for(double i=1;i<=num;i++) {
			HarmonicNumber += 1/i;
		}
		System.out.println("Nth Harmonic Number of "+ num + ".=" + HarmonicNumber);
	}

}
