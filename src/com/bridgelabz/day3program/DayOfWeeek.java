package com.bridgelabz.day3program;

import java.util.Scanner;

public class DayOfWeeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day");
		int day = sc.nextInt();
		System.out.println("Enter month");
		int month = sc.nextInt();
		System.out.println("Enter Year");
		int year = sc.nextInt();
		
		int y0 = 0 ,m0 = 0,d0 = 0,x=0;
		y0 = year -(14-month)/12;
		x=y0+y0/4-y0/100+y0/400;
		m0 = month+12*((14-month)/12)-2;
		d0 = (day+x+31*m0/12)%7;
		
		switch(d0) {
		case 0:
			System.out.println("Sunday");
			break;
			
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wenesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Satarday");
			break;
			
		}
	}
}
