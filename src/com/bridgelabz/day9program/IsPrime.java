package com.bridgelabz.day9program;

import java.util.Scanner;

public class IsPrime {
	static boolean getPrimeNumber(int n) {
		if(n<=1) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		System.out.println(getPrimeNumber(num));
	}
}
