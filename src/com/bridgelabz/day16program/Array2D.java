package com.bridgelabz.day16program;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter row for the array  : ");
	   int row = sc.nextInt();
	    System.out.print("Enter column for the array  : ");
	   int col = sc.nextInt();
	   int arr[][] = new int[row][col];
	    System.out.println("Enter " + (row * col) + " Array Elements : ");
	    for (int i = 0; i < row; i++) {
	      for (int j = 0; j < col; j++) {
	       arr[i][j] = sc.nextInt();
	      }
	    }

	    array(arr);
	  }

	public static void array(int [][]arr) {
		 int  i, j;
		 System.out.print("The Array is :\n");
		    for (i = 0; i < arr.length; i++) {
		      for (j = 0; j < arr.length; j++) {
		        System.out.print(arr[i][j] + "  ");		       
		      }
		      System.out.println();
		    }		   	
	}
}
