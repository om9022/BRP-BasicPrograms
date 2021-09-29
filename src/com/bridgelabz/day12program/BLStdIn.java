package com.bridgelabz.day12program;

import java.util.Scanner;

public class BLStdIn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("Enter Integer followed by string:");
		if(sc.hasNextInt()) {
			number = sc.nextInt();
		}else {
			System.out.println("Error, program terminating");
			sc.close();
			return;
		}
		String str = sc.nextLine();
		System.out.println("Integer = "+number+ " String = "+str+ " ' ");
		sc.close();
	}
	
	public static String readALl() {
	return null;
	}
	
	public static boolean isEmpty() {
		return false;
	}
	
	public static String readString() {
		return null;
	}
	
	public static String[] readAllStrings() {
		return null;
	}
}
