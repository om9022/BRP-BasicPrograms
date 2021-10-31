package com.bridgelabz.day17program;

import java.util.Scanner;

public class PalindromePNumber {
	public static void primePallindrome(int num) {
		int count=0; int rev=0; int rem;
		int temp=num;
			for(int i=1; i<=temp; i++) {
				if(temp%i==0) {
					count++;
				}
			}
		if(count==2) {
		while( temp>0 ) {
			
			rem=temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(num==rev ) {
			System.out.println(num+ "  is pallindromic prime ");
		}
		else
			System.out.println(num+ " is not pallindromic prime ");
	}
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of element");
		int  num = sc.nextInt();
		primePallindrome(num);

	}
}
