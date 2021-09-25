package com.bridgelabz.day5program;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
	}

	public void flipCoin(int f1) {
		int count=0,count1=0,coin=0,temp=0;
		temp=f1;
		while(f1!=0) {
			coin = (int) Math.floor(Math.random()*2);
			if(coin == 1) {
				count++;
			}else {
				count1++;
			}
			f1--;
		}
		
		System.out.println(count);
		System.out.println(count1);
		
	}
	public void powOf2(int num) {
		int x=1;
		for(int i=0;i<num;i++) {
			x= 2*x;
			System.out.println(x);
		}
	}

}
