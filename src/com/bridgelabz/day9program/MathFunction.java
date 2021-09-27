package com.bridgelabz.day9program;

import java.util.Scanner;

public class MathFunction{
	public static double getHarmonic(int n) {
		double harmonicNumber = 0;
		for(double i=1;i<=n;i++) {
			harmonicNumber += 1/i;
		}
		return harmonicNumber;
	}
	
	public static double getSqrt(double c) {
		double res = Math.sqrt(c);
		return res;
	}
	
	public static void getBinary(int n) {
		System.out.println(Integer.toBinaryString(n));
	}
	
	public static double getSine(int a) {
		double b = Math.toRadians(a);
		Math.sin(b);
		return b;
	}
	
	public static double getCoine(int a) {
		double b = Math.toRadians(a);
		Math.cos(b);
		return b;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter value of n which you want to check: ");
//		int num = sc.nextInt();
//		System.out.println("harmonic number is: "+getHarmonic(num));
		
//		System.out.println("Enter a number for square root");
//		double c = sc.nextDouble();
//		System.out.println(getSqrt(c));
		
//		System.out.println("Enter a Number to get binary: ");
//		int num = sc.nextInt();
//		getBinary(num);
		
//		System.out.println("Enter a number to get value of sine: ");
//		int num = sc.nextInt();
//		System.out.println(getSine(num));
		
		System.out.println("Enter a number to get value of cos: ");
		int num = sc.nextInt();
		System.out.println(getSine(num));
	}
}
