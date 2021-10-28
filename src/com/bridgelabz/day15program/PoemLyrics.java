package com.bridgelabz.day15program;

import java.util.Scanner;

public class PoemLyrics {
	public static void verse(String animalN, String Anoise){
		String s1 = "Old McDonald had a farm"+
				"E-I-E-I-O"+
				"And on his farm he had some ANIMAL"+
				" E-I-E-I-O"+
				"With a SOUND SOUND here"+
				"And a %SOUND% %SOUND% there"+
				"Here a %SOUND% there a %SOUND%"+
				"Everywhere a %SOUND% %SOUND%";
		
		String replaceString1=s1.replace("ANIMAL",animalN);
		String replaceString2=replaceString1.replace("SOUND",Anoise);
		System.out.println(replaceString2);
	}
	
	 public static void main(String[] args)
	  {
		  Scanner sc = new Scanner (System.in);
		  System.out.println("enter animal name");
		  String animalN= sc.next();
		  System.out.println("enter sound");
		  String Anoise= sc.next();
		  verse( animalN, Anoise );
	  }
}
