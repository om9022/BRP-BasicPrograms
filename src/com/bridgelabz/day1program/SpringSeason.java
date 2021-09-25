package com.bridgelabz.day1program;

import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month");
		int month = sc.nextInt();
		System.out.println("Enter a Day");
		int day = sc.nextInt();
		sc.close();
		if(month >= 3 && month <= 6 && day > 0 && day <= 32) {
			if(day >= 20 && month == 3) {
				System.out.println("True");
			}else if(month == 4 || month == 5) {
				System.out.println("True");
			}else if(day<=20 && month ==6) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}else {
			System.out.println("False");
		}
	}
}
