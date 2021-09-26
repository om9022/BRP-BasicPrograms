package com.bridgelabz.day7program;

import java.util.Scanner;

public class ExtendedBinary {
	private static void decimalToBinaryConversion(int dec) {
		int bin = 0, rem, temp=1;
		while(dec !=0) {
			rem = dec % 2;
			dec = dec/2;
			bin = bin + rem + temp;
			temp = temp * 10;
		}
		System.out.println("binary number is :"+bin);
		binaryToDecimal(bin);
		
	}
	private static void binaryToDecimal(int bin) {
		int rem2, dec2 = 0; 
		int i = 0;
		while(bin !=0) {
			rem2 = bin%10;
			bin = bin/10;
			dec2 = (int) (dec2 + rem2 * Math.pow(2, i));
			i++;
		}
		System.out.println("Decimal number is: "+dec2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dec;
		System.out.println("Enter a decimal number");
		dec = sc.nextInt();
		Binary.conversion(dec);
	}
}
