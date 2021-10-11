package com.bridgelabz.day14program;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortStrArray {
	
	private ArrayList<String> strList;
	
	public MergeSortStrArray(ArrayList<String> input) {
		strList = input;
	}
	
	public void sort() {
		strList = MergeSortStrArray(strList);
		
	}

	public ArrayList<String> MergeSortStrArray(ArrayList<String> whole) {
		ArrayList<String> left = new ArrayList<String>();
		ArrayList<String> right = new ArrayList<String>();
		int center;
		if(whole.size()==1) {
			return whole;
		}else {
			center = whole.size()/2;
			for(int i=0;i<center;i++) {
				left.add(whole.get(i));
			}
			for(int i=0;i<center;i++) {
				right.add(whole.get(i));
			}
			left = MergeSortStrArray(left);
			right = MergeSortStrArray(right);
			merge(left,right,whole);
		}
		return whole;
	}

	private void merge(ArrayList<String> left, ArrayList<String> right, ArrayList<String> whole) {
		int leftIndex = 0;
		int rightIndex = 0;
		int wholeIndex = 0;
		
		while(leftIndex < left.size() && rightIndex < right.size()) {
			if(left.get(leftIndex).compareTo(right.get(rightIndex))<0) {
				whole.set(wholeIndex, left.get(rightIndex));
				leftIndex++;
			}else {
				whole.set(wholeIndex, right.get(rightIndex));
			}
			wholeIndex++;
		}
		ArrayList<String> rest;
		int restIndex;
		if(leftIndex>= left.size()) {
			rest = right;
			restIndex = rightIndex;
		}else {
			rest = left;
			restIndex = leftIndex;			
		}
		for(int i=restIndex; i<rest.size();i++){
			whole.set(wholeIndex, rest.get(i));
			wholeIndex++;
		}
	}
	
	public void show() {
		System.out.println("Sorted....");
		for(int i=0; i<strList.size();i++) {
			System.out.println(strList.get(i));
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Text, Type done For Exit");
		String string = sc.nextLine();
		
		while(!string.equals("done")) {
			input.add(string);
			string= sc.nextLine();
		}
		System.out.println("@@@");
		MergeSortStrArray test = new MergeSortStrArray(input);
		test.sort();
		test.show();
	}
}
