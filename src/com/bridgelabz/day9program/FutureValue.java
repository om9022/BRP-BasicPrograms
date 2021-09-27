package com.bridgelabz.day9program;

import java.util.Scanner;

public class FutureValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a present value :");
		double p = sc.nextDouble();
		System.out.println("Enter Interested rate:  ");
		double r = sc.nextDouble();
		System.out.println("Enter Time Peroid: ");
		double y = sc.nextDouble();
		double f = p*Math.pow((1+r/100), y);
		System.out.println("value is: "+f);
	}
}
