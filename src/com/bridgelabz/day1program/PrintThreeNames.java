package com.bridgelabz.day1program;

import java.util.Scanner;

public class PrintThreeNames {
	public static void main(String[] args) {
		String name1;
		String name2;
		String name3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First name :");
		name1 = sc.next();
		System.out.println("Enter a Second name :");
		name2 = sc.next();
		System.out.println("Enter a Third name :");
		name3 = sc.next();
		
		System.out.println("Hii, " + name3+"," + name2+"," +name3);
		
		
	}
}
