package com.bridgelabz.day13program;

public class BinaryStringSearch {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("Enter Array String Size: ");
		int size = u.getIntInput();
		System.out.println("Enter String Element : ");
		String[] name = u.getStringArray(size);
		System.out.println("Enter Target Element: ");
		String word = u.getStringInput();
		int p = u.binarysearchString(name, word);
		if(p==-1) {
			System.out.println("Not Found");
		}else {
			System.out.println("Found at "+ p + " Position");
		}
	}
}
