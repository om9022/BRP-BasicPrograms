package com.bridgelabz.day14program;

public class BubbleSortInt {
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;i<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {72,4,31,35,9,51};
		bubbleSort(arr);
		for(int n : arr) {
			System.out.println(n);
		}
	}
}
