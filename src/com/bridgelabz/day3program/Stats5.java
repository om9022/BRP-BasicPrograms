package com.bridgelabz.day3program;

public class Stats5 {
	public static void main(String[] args) {
		int n = 5;
		double a1 = Math.random();
		double a2 = Math.random();
		double a3 = Math.random();
		double a4 = Math.random();
		double a5 = Math.random();
		System.out.println("Random num: "+a1);
		System.out.println("Random num: "+a2);
		System.out.println("Random num: "+a3);
		System.out.println("Random num: "+a4);
		System.out.println("Random num: "+a5);
		
		double min = Math.min(a1, Math.min(a3, Math.min(a4, a5)));
		double max = Math.max(a1, Math.max(a3, Math.max(a4, a5)));
		double average =(a1 + a2 + a3+a4+a5)/n;
		System.out.println("Average = "+ average);
		System.out.println("Min: "+min);
		System.out.println("MAx: "+max);
	}
}
