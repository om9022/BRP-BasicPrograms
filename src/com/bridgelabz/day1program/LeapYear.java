package com.bridgelabz.day1program;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year which you want to check leap year");
		int year = sc.nextInt();
		sc.close();
		int noOfDigit = 0;
		int temp = 1;
		
		while(temp <= year) {
			noOfDigit++;
			temp = temp *10;
		}
		if(noOfDigit == 4) {
			checkLeapYear(year);		
		}else {
			System.err.println("Entered year is Invalid");
		}
	}

	private static void checkLeapYear(int year) {
		if((year % 4) == 0 && (year % 100) != 0 || (year % 400)== 0) {
			System.err.println("year is leap year");
		}else{			
			System.err.println("Year is Not Leap Year");
		}
	}
}
