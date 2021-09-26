package com.bridgelabz.day6program;

import java.util.Scanner;

public class PrimeNumbers {
	public static int isPrime(int n, int count) {
		for(int j=2; j<n-1;j++) {
			if(n % j == 0) {
				count ++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array you want: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter a numbers: ");
		for(int i = 0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Prime Number Form given Array is:");
		for(int i=0; i<array.length; i++) {
			int count = 0;
			int primeNumber = isPrime(array[i], count);
			if(primeNumber == 0) {
				System.out.println(array[i]);
			}
		}
	}
}
