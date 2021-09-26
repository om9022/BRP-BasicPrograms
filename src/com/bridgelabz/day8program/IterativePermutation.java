package com.bridgelabz.day8program;

import java.util.Scanner;

public class IterativePermutation {
	static void printPermute(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans +" ");
			return;
		}
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0,i) + str.substring(i+1);
			printPermute(ros, ans + ch);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1;
		System.out.println("Enter string:");
		str1= sc.nextLine();
		printPermute(str1, " ");
	}
}
