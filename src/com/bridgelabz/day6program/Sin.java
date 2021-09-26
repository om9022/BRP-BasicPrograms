package com.bridgelabz.day6program;

import java.util.Scanner;

public class Sin {
	static int fact = 1;
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a Number of Terms:");
		double num = sc.nextDouble();
		System.out.println("Enter a angle :");
		double a = sc.nextDouble();
		double rad = sc.nextDouble();
		calculateTaylorSeries(rad,num);
	}
	private static void calculateTaylorSeries(double rad, double n) {
		int power = 1;
		double sinx = 0.0;
		for(int i=1; i<=n; i++) {
			double currentTerms;
			if(i % 2 == 0) {
				currentTerms = -Math.pow(rad,power)/getfactorial(power);	
			}else {
				currentTerms = Math.pow(rad,power)/getfactorial(power);
			}
			sinx = sinx + currentTerms;
			power = power + 2;
		}
		System.out.println(sinx);
	}
	private static double getfactorial(int num) {
		for(int i = num; i > 0; i--) {
			fact = fact * i;
		}
		return 0;
	}
}
