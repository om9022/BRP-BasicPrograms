package com.bridgelabz.day13program;

import java.util.Scanner;

public class Utility {
	Scanner sc;
	public Utility() {
		sc = new Scanner(System.in);
	}

	public int getIntInput() {	
		return sc.nextInt();
	}

	public int[] getInputArray(int size) {
		System.out.println("enter number ");
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		return arr;
	}

	public int binarysearchInt(int[] arr, int key) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(key==arr[mid]) {
				return mid;
			}else if(key<arr[mid]) {
				end=mid-1;
			}else {
				start= mid+1;
			}
		}
		return -1;
	}

	public String[] getStringArray(int size) {
		System.out.println("Enter String Array ;");
		String[] word = new String[size];
		for(int i=0; i<word.length;i++) {
			word[i]= sc.nextLine();
		}
		return word;
	}

	public String getStringInput() {
		
		return sc.nextLine();
	}

	public int binarysearchString(String[] word, String key) {
		int first = 0;
		int last = word.length;
		while(first<last) {
			int mid = (first+last)/2;
			if(key.compareTo(word[mid])<0) {
				last = mid;
			}else if(key.compareTo(word[mid])>0) {
				first = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
