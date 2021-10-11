package com.bridgelabz.day14program;

import java.util.Scanner;

public class InsertionSortStrArray {
	public static void insertionSort(String[] str) {
		for(int i=0; i<str.length-1; i++) {
			for(int j=i+1;j>0;j--) {
				if(str[j].compareTo(str[j-1])<0) {
					String temp = str[j];
					str[j] = str[j-1];
					str[j-1] = temp;
				}
			}
		}
		for(String c: str) {
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		String[] str = new String[n];
		System.out.println("Enter Youyr String Elements");
		for(int i=0;i<n;i++) {
			str[i]= sc.nextLine();
		}
		insertionSort(str);
	}
}
