package com.bridgelabz.day10program;

import java.util.Scanner;

public class CheckCollinearUsingSlope {
	static boolean checkColinear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("x1: ");
		int x1 = sc.nextInt();
		System.out.println("y1: ");
		int y1 = sc.nextInt();
		System.out.println("x2: ");
		int x2 = sc.nextInt();
		System.out.println("y2: ");
		int y2 = sc.nextInt();
		System.out.println("x3: ");
		int x3 = sc.nextInt();
		System.out.println("y3: ");
		int y3 = sc.nextInt();
		
		int AB = (y2-y1)/(x2-x1);
		int BC = (y3-y2)/(x3-x2);
		int AC = 0;
		if(AB==BC) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(checkColinear());
	}
}
