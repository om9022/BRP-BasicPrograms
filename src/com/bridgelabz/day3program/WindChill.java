package com.bridgelabz.day3program;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp, wSpeed, wChill;
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
		temp = sc.nextDouble();
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		wSpeed = sc.nextDouble();
		
		  if (temp < -58 || temp > 41) {
	            System.out.println ("The temperature you entered is invalid.");
	        }

	        if (wSpeed < 2) {
	            System.out.println ("The wind speed you entered is invalid.");
	        }

	        else {

	            wChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(wSpeed, 0.16) + 0.4275 * temp * Math.pow(wSpeed, 0.16);

	            System.out.print("The wind chill index is " + wChill);
	        }
	}
}
