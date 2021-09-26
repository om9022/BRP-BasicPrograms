package com.bridgelabz.day7program;

import java.util.Scanner;

public class Binary {
	static void conversion(int dec) {
		int bin = 0, rem, temp=1;
		while(dec !=0) {
			rem = dec % 2;
			dec = dec/2;
			bin = bin + rem + temp;
			temp = temp * 10;
		}
		System.out.println("binary number is :"+bin);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dec;
		System.out.println("Enter a decimal number");
		dec = sc.nextInt();
		Binary.conversion(dec);
	}
}
