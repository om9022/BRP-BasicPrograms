package com.bridgelabz.day10program;

import java.util.Scanner;

public class MAxNumArry {
	public static double arrayMax(double[] arr) {
		double max = Double.NEGATIVE_INFINITY;
		
		for(double cur: arr) {
			max = Math.max(max, cur);			
		}
		return max;
	}
	
	public static double arrMin(double[] arr) {
		double min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextDouble();
		}
		System.out.println(arrayMax(arr));
		System.out.println(arrMin(arr));
	}
}
